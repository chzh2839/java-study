package customerpoint;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

// �ǽ����� 8��
public class PointManageHashMap {
	private Scanner input = new Scanner(System.in);
	private HashMap<String, Integer> map = new HashMap<>();
	
	// �Է¹ޱ�
	public void inputData() {
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ�. **");
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է� >> ");
			String text = input.nextLine();
			
			if(text.equals("�׸�")) {
				System.out.println("����..");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(text, " ");
			String name = st.nextToken().trim();
			int point = Integer.parseInt(st.nextToken().trim());
			
			if(map.containsKey(name)) { // true
				int existPoint = map.get(name);
				map.put(name, point+existPoint);
			}else {
				map.put(name, point);
			}
			

			printData();
			System.out.println();
		}
	}
	
	// ������ ���
	private void printData() {
		Set<String> s = map.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int point = map.get(name);
			
			System.out.print("("+name+", "+point+") ");
		}
	}
	
	
	
	// main
	public static void main(String[] args) {
		PointManageHashMap pManager = new PointManageHashMap();
		pManager.inputData();
	}

}
