package grade_average;

import java.util.ArrayList;
import java.util.Scanner;

// 실습문제 2번
public class GradeAvg {
	private Scanner input = new Scanner(System.in);
	private ArrayList<Double> arr = new ArrayList<Double>();
	
	// 6개 입력
	public void inputGrade() {
		System.out.println("6개의 학점을 빈칸으로 분리해서 입력(A/B/C/D/F) >> ");
		
		for(int i=0; i<6; i++) {
			String grade = input.next();
			saveArr(grade);
		}
	}

	// 학점에 따라 arr에 값 저장
	private void saveArr(String g) {
		switch(g) {
		case "A":
			arr.add(4.0);
			break;
		case "B":
			arr.add(3.0);
			break;
		case "C":
			arr.add(2.0);
			break;
		case "D":
			arr.add(1.0);
			break;
		case "F":
			arr.add(0.0);
			break;
		}
	}
	
	
	// 평균구하기
	public double calcAvg() {
		double sum=0;
		for(int i=0; i<arr.size(); i++) {
			sum += arr.get(i);
		}
		return sum / arr.size();
	}
	
	
	// main
	public static void main(String[] args) {
		GradeAvg manager = new GradeAvg();
		manager.inputGrade();
		
		System.out.println(manager.calcAvg());
	}

}
