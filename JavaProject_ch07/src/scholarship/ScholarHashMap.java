package scholarship;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// 실습문제 7번
public class ScholarHashMap {
	private HashMap<String, Double> map = new HashMap<String, Double>();
	private Scanner input = new Scanner(System.in);
	
	// 입력
	private void inputData() {
		System.out.println("미래장학금관리시스템입니다.");
		for(int i=0; i<5; i++) {
			System.out.print("이름과 학점>> ");
			String name = input.next();
			double grade = input.nextDouble();
			
			map.put(name, grade);
		}
	}
	
	// 학생 선발
	private void pickStudent() {
		System.out.print("\n장학생 선발 학점 기준 입력 >> ");
		double passGrade = input.nextDouble();
		
		System.out.print("장학생 명단 : ");
		
		Set<String> s = map.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String student = it.next();
			double grade = map.get(student);
			
			if(grade >= passGrade) {
				System.out.print(student+" ");
			}
		}
	}
	
	public void run() {
		inputData();
		pickStudent();
	}
	
	// main
	public static void main(String[] args) {
		ScholarHashMap sch = new ScholarHashMap();
		sch.run();
	}

}
