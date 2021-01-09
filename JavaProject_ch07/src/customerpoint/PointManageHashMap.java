package customerpoint;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

// 실습문제 8번
public class PointManageHashMap {
	private Scanner input = new Scanner(System.in);
	private HashMap<String, Integer> map = new HashMap<>();
	
	// 입력받기
	public void inputData() {
		System.out.println("** 포인트 관리 프로그램입니다. **");
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			String text = input.nextLine();
			
			if(text.equals("그만")) {
				System.out.println("종료..");
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
	
	// 데이터 출력
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
