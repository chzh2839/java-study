package scholarship;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// �ǽ����� 7��
public class ScholarHashMap {
	private HashMap<String, Double> map = new HashMap<String, Double>();
	private Scanner input = new Scanner(System.in);
	
	// �Է�
	private void inputData() {
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		for(int i=0; i<5; i++) {
			System.out.print("�̸��� ����>> ");
			String name = input.next();
			double grade = input.nextDouble();
			
			map.put(name, grade);
		}
	}
	
	// �л� ����
	private void pickStudent() {
		System.out.print("\n���л� ���� ���� ���� �Է� >> ");
		double passGrade = input.nextDouble();
		
		System.out.print("���л� ��� : ");
		
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
