package nations;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;


// �ǽ����� 3��
public class NationsHashMap {
	private HashMap<String, Integer> nations = new HashMap<String, Integer>();
	private Scanner input = new Scanner(System.in);

	// �Է�
	private void inputData() {
		// '�׸�'�Ҷ����� ��� �Է�
		while (true) {
			System.out.print("�����̸�, �α� >> ");
			String text = input.nextLine();
			
			if (text.equals("�׸�")) {
				System.out.println("����..");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(text, ",");

			String nation = st.nextToken().trim();
			int pp = Integer.parseInt(st.nextToken().trim());

			nations.put(nation, pp);
		}
	}
	
	// ��ȸ
	private void searchData() {
		while(true) {
			System.out.print("�α��˻� >> ");
			String nation = input.next();
			
			if(nation.equals("�׸�")) {
				System.out.println("����..!");
				break;
			}
			
			if(nations.containsKey(nation)) {
				int pp = nations.get(nation);
				System.out.println(nation+"�� �α��� "+pp+"���Դϴ�.");
			}else {
				System.out.println("���� �����Դϴ�.");
			}
			
		}
		
		
	}
	
	// ȣ��
	public void run() {
		System.out.println("���� �̸��� �α��� �Է��ϼ���. (,�� ����)");
		inputData();
		searchData();
	}

	// main
	public static void main(String[] args) {
		NationsHashMap n = new NationsHashMap();
		n.run();
		
	}
}
