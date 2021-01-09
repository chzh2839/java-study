package location;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

// �ǽ����� 6��
public class LocationHashMap {
	private HashMap<String, Location> map = new HashMap<String, Location>();
	private Scanner input = new Scanner(System.in);
	
	// �Է¹ޱ�
	private void inputData() {
		System.out.println("����,�浵,������ �Է��ϼ���.");
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = input.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			
			String city = st.nextToken().trim();
			int longi = Integer.parseInt(st.nextToken().trim());
			int lati = Integer.parseInt(st.nextToken().trim());
			
			map.put(city, new Location(city, longi, lati));
		}
	}
	
	// ������ ���
	private void printData() {
		Set<String> key = map.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String keys = it.next();
			Location l = map.get(keys);
			System.out.println(l.toString());
		}
	}
	
	// ��ȸ�ϱ�
	private void searchData() {
		while(true) {
			System.out.print("�����̸� >> ");
			String c = input.next();
			
			if(c.equals("�׸�")) {
				System.out.println("����..");
				break;
			}
			
			if(map.containsKey(c)) {
				System.out.println(map.get(c).toString());
			}else {
				System.out.println(c+"�� ���� �����Դϴ�.");
			}
		}
	}
	
	public void run() {
		inputData();
		System.out.println("---------------------------------");
		printData();
		System.out.println("---------------------------------");
		searchData();
	}
	
	public static void main(String[] args) {
		LocationHashMap loc = new LocationHashMap();
		loc.run();
	}

}
