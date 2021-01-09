package student_info;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

//실습문제 5-2번
public class HashMapEx {
	private HashMap<String, Student> map = new HashMap<String, Student>();
	private Scanner input = new Scanner(System.in);
	
	// 입력
	private void read() {
		System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요.");
		
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = input.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String sdNum = st.nextToken().trim();
			double gradeAvg = Double.parseDouble(st.nextToken().trim());
			
			map.put(name, new Student(name,major,sdNum,gradeAvg));
		}
	}
	
	// 출력
	private void printAll() {
		Set<String> s = map.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Student data = map.get(key);
			data.printData();
		}
	}
	
	
	// 키 값에 따라 정보 출력
	private void processQuery() {
		while(true) {
			System.out.println("------------------------------");
			System.out.print("학생이름 >> ");
			String key = input.next();
			
			if(key.equals("그만")) {
				System.out.println("종료...");
				input.close();
				return;
			}
			
			Student data = map.get(key);
			
			if(data == null) {
				System.out.println("없는 사람!");
			}else {
				data.printData();
			}
			
		}
		
		
	}
	
	
	// 전체 호출
	public void run() {
		read();
		printAll();
		processQuery();
	}
	
	// main
	public static void main(String[] args) {
		HashMapEx studentManager = new HashMapEx();
		studentManager.run();
	}

}
