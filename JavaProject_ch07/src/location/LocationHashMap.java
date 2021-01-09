package location;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

// 실습문제 6번
public class LocationHashMap {
	private HashMap<String, Location> map = new HashMap<String, Location>();
	private Scanner input = new Scanner(System.in);
	
	// 입력받기
	private void inputData() {
		System.out.println("도시,경도,위도를 입력하세요.");
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
	
	// 데이터 출력
	private void printData() {
		Set<String> key = map.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String keys = it.next();
			Location l = map.get(keys);
			System.out.println(l.toString());
		}
	}
	
	// 조회하기
	private void searchData() {
		while(true) {
			System.out.print("도시이름 >> ");
			String c = input.next();
			
			if(c.equals("그만")) {
				System.out.println("종료..");
				break;
			}
			
			if(map.containsKey(c)) {
				System.out.println(map.get(c).toString());
			}else {
				System.out.println(c+"는 없는 도시입니다.");
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
