package student_info;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


// �ǽ����� 5-1��
public class ArrayListEx {
	private ArrayList<Student> st = new ArrayList<Student>();
	private Scanner input = new Scanner(System.in);

	// �Է�
	private void read() {
		for (int i = 0; i < 4; i++) {
			System.out.println("�л��̸�, �а�, �й�, ������� �Է��ϼ���.");
			String name = input.next();
			String major = input.next();
			String sdNum = input.next();
			double gradeAvg = input.nextDouble();

			// StringTokenizer ����ϴ� ��
			/*
			 * String text = input.nextLine();
			 * StringTokenizer stoken = new StringTokenizer(text, ",");
			 * String name = stoken.nextToken().trim(); //trim() >> �յ� ���� ����
			 * String major = stoken.nextToken().trim();
			 * String sdNum = stoken.nextToken().trim();
			 * double gradeAvg = Double.parseDouble(stoken.nextToken().trim()); 
			 * // >> nextLine()�� �޾ұ� ������  parseDouble�� �Ǽ������� ��ȯ�ϱ�
			 */

			st.add(new Student(name, major, sdNum, gradeAvg));
		}
	}
	
	// ���
	private void printAll() {
		for(int i=0; i<st.size(); i++) {
			Student s = st.get(i);
			s.printData();
		}
		
		// Iterator ����ϴ� ��
//		Iterator<Student> it = st.iterator();
//		while(it.hasNext()) {
//			Student s = it.next();
//			s.printData();
//		}
	}
	
	
	// �̸� �Է� �޾� �ش� ������ ���
	private void processQuery() {
		while(true) {
			System.out.println("----------------------------------");
			System.out.print("�л� �̸� >> ");
			String n = input.next();
			
			if(n.equals("�׸�")) {
				System.out.print("����...");
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
				System.out.println("���� ����..");
			}
			
		}
	}
	
	
	// private �޼��� ��ü�� ȣ���ϴ� public �޼��� �ϳ� ����
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
