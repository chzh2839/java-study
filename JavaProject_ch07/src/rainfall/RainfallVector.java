package rainfall;

import java.util.Scanner;
import java.util.Vector;

// 실습문제 4번
public class RainfallVector {
	private Scanner input = new Scanner(System.in);
	private Vector<Integer> v = new Vector<Integer>();
	
	// 입력
	public void inputData() {
		while(true) {
			System.out.print("강수량 입력 (0 입력 시 종료) >> ");
			int rainfall = input.nextInt();
			
			if(rainfall == 0) {
				System.out.println("종료..");
				break;
			}
			
			v.add(rainfall);
			for(int n : v) {
				System.out.print(n+" ");
			}
			
			System.out.printf("\n현재 평균 : %.1f\n", calcAvg());
		}
	}
	
	// 평균구하기
	private double calcAvg() {
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			sum += v.get(i);
		}
		return (double)sum / v.size();
	}
	
	
	// main
	public static void main(String[] args) {
		RainfallVector rf = new RainfallVector();
		rf.inputData();
	}

}
