package nations;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;


// 실습문제 3번
public class NationsHashMap {
	private HashMap<String, Integer> nations = new HashMap<String, Integer>();
	private Scanner input = new Scanner(System.in);

	// 입력
	private void inputData() {
		// '그만'할때까지 계속 입력
		while (true) {
			System.out.print("나라이름, 인구 >> ");
			String text = input.nextLine();
			
			if (text.equals("그만")) {
				System.out.println("종료..");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(text, ",");

			String nation = st.nextToken().trim();
			int pp = Integer.parseInt(st.nextToken().trim());

			nations.put(nation, pp);
		}
	}
	
	// 조회
	private void searchData() {
		while(true) {
			System.out.print("인구검색 >> ");
			String nation = input.next();
			
			if(nation.equals("그만")) {
				System.out.println("종료..!");
				break;
			}
			
			if(nations.containsKey(nation)) {
				int pp = nations.get(nation);
				System.out.println(nation+"의 인구는 "+pp+"명입니다.");
			}else {
				System.out.println("없는 나라입니다.");
			}
			
		}
		
		
	}
	
	// 호출
	public void run() {
		System.out.println("나라 이름과 인구를 입력하세요. (,로 구분)");
		inputData();
		searchData();
	}

	// main
	public static void main(String[] args) {
		NationsHashMap n = new NationsHashMap();
		n.run();
		
	}
}
