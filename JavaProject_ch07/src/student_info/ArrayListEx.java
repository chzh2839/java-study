package student_info;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


// 실습문제 5-1번
public class ArrayListEx {
	private ArrayList<Student> st = new ArrayList<Student>();
	private Scanner input = new Scanner(System.in);

	// 입력
	private void read() {
		for (int i = 0; i < 4; i++) {
			System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요.");
			String name = input.next();
			String major = input.next();
			String sdNum = input.next();
			double gradeAvg = input.nextDouble();

			// StringTokenizer 사용하는 법
			/*
			 * String text = input.nextLine();
			 * StringTokenizer stoken = new StringTokenizer(text, ",");
			 * String name = stoken.nextToken().trim(); //trim() >> 앞뒤 공백 제거
			 * String major = stoken.nextToken().trim();
			 * String sdNum = stoken.nextToken().trim();
			 * double gradeAvg = Double.parseDouble(stoken.nextToken().trim()); 
			 * // >> nextLine()로 받았기 때문에  parseDouble로 실수형으로 변환하기
			 */

			st.add(new Student(name, major, sdNum, gradeAvg));
		}
	}
	
	// 출력
	private void printAll() {
		for(int i=0; i<st.size(); i++) {
			Student s = st.get(i);
			s.printData();
		}
		
		// Iterator 사용하는 법
//		Iterator<Student> it = st.iterator();
//		while(it.hasNext()) {
//			Student s = it.next();
//			s.printData();
//		}
	}
	
	
	// 이름 입력 받아 해당 정보만 출력
	private void processQuery() {
		while(true) {
			System.out.println("----------------------------------");
			System.out.print("학생 이름 >> ");
			String n = input.next();
			
			if(n.equals("그만")) {
				System.out.print("종료...");
				input.close();
				return;
			}
			
			boolean b = false;
			for(int i=0; i<st.size(); i++) {
				Student s = st.get(i);
				if(s.getName().equals(n)) {
					s.printData();
					b= true;
					break;
				}
			}
			
			if(b==false) {
				System.out.println("없는 정보..");
			}
			
		}
	}
	
	
	// private 메서드 전체를 호출하는 public 메서드 하나 생성
	public void run() {
		read();
		printAll();
		processQuery();
	}
	
	// main
	public static void main(String[] args) {
		ArrayListEx stManager = new ArrayListEx();
		stManager.run();
	}
						

}
