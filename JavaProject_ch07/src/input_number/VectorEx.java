package input_number;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

// �ǽ����� 1��
public class VectorEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		
		System.out.print("����(-1�� �Էµ� ������) >> ");
		while(true) {
			int num = input.nextInt();
			
			if(num < 0) {
				input.close();
				break;
			}
			
			v.add(num);

			
		}
		
//		int m = 0;
//		for(int i=0; i<v.size(); i++) {
//			int number = v.get(i);
//			if(m < number) {
//				m = number;
//			}
//		}
//		int m = v.isEmpty() ? 0 : Collections.max(v);
		System.out.println("���� ū ���� "+Collections.max(v));
		
		
	}

}
