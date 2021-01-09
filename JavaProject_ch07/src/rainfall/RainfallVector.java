package rainfall;

import java.util.Scanner;
import java.util.Vector;

// �ǽ����� 4��
public class RainfallVector {
	private Scanner input = new Scanner(System.in);
	private Vector<Integer> v = new Vector<Integer>();
	
	// �Է�
	public void inputData() {
		while(true) {
			System.out.print("������ �Է� (0 �Է� �� ����) >> ");
			int rainfall = input.nextInt();
			
			if(rainfall == 0) {
				System.out.println("����..");
				break;
			}
			
			v.add(rainfall);
			for(int n : v) {
				System.out.print(n+" ");
			}
			
			System.out.printf("\n���� ��� : %.1f\n", calcAvg());
		}
	}
	
	// ��ձ��ϱ�
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
