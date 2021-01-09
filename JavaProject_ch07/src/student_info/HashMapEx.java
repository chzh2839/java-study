package student_info;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

//�ǽ����� 5-2��
public class HashMapEx {
	private HashMap<String, Student> map = new HashMap<String, Student>();
	private Scanner input = new Scanner(System.in);
	
	// �Է�
	private void read() {
		System.out.println("�л��̸�, �а�, �й�, ������� �Է��ϼ���.");
		
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
	
	// ���
	private void printAll() {
		Set<String> s = map.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Student data = map.get(key);
			data.printData();
		}
	}
	
	
	// Ű ���� ���� ���� ���
	private void processQuery() {
		while(true) {
			System.out.println("------------------------------");
			System.out.print("�л��̸� >> ");
			String key = input.next();
			
			if(key.equals("�׸�")) {
				System.out.println("����...");
				input.close();
				return;
			}
			
			Student data = map.get(key);
			
			if(data == null) {
				System.out.println("���� ���!");
			}else {
				data.printData();
			}
			
		}
		
		
	}
	
	
	// ��ü ȣ��
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
