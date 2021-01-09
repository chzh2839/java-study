package word_test_game;

import java.util.Scanner;
import java.util.Vector;

// 오픈챌린지 & 실습문제12번
public class WordTestEx {
	private static Scanner input = new Scanner(System.in);
	private static Vector<Word> v = new Vector<Word>();
	private static int dap = 0;

	
	// 단어 삽입하기
	public void inputWord() {
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		int n = v.size();
		System.out.println("현재 저장된 단어 개수 : "+n);
		
		// 입력받아 더 삽입하기
		while (true) {
			System.out.print("영어 한글 >>");
			String eng = input.next();

			if (eng.equals("그만")) {
				System.out.println("단어삽입 끝");
				break;
			}
			
			String kor = input.next();
			
			// 중복확인
			for(int i=0; i<v.size(); i++) {
				Word w = v.get(i);
				if(w.getEng().equals(eng)) {
					System.out.println("중복된 단어가 존재합니다.");
					continue;
				}
			}
			v.add(new Word(eng, kor));
			n++;

		} // while end
		

	}

	// 난수 발생 메서드
	private int randomNum(int limit) {
		double n = Math.random() * limit;
		return (int) n;
	}

	// 문제내기
	private void giveQuestion() {
		String[] s = new String[4];

		while (true) {
			// 반복할때마다 난수발생
			int index = randomNum(v.size()); // 문제의 난수
			Word w = v.get(index);
			String e = w.getEng();
			String k = w.getKor();

			boolean check = false;

			// 보기 배열에 저장
			for (int i = 0; i < 4; i++) {
				int n = randomNum(v.size());
				s[i] = v.get(n).getKor();
			}
			
			// 답확인
			for(int i =0; i<4; i++) {
				if (s[i].equals(k)) {
					check = true;
					dap = i + 1; // 답 저장!
				}
			}

			// 답이 배열 안에 있으면 문제 출력
			if (check) {
				System.out.println(e + "?"); // 문제
				for (int i = 0; i < 4; i++) {
					System.out.print("(" + (i+1) + ")" + s[i] + "\t"); // 보기
				}
				break;
			}

		} // while end

	}

	// 문제 정답확인
	public void checkAnswer() {
		System.out.println("\"명품영어\"의 단어테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + v.size() + "개의 단어가 들어있습니다.");
		
		while(true) {
			giveQuestion(); // 문제 냄
			
			System.out.print("답은 >> ");
			int answer = input.nextInt();

			if(answer>0 && answer<5) {
				if (answer == dap) {
					System.out.println("Excellent!!");
				}else {
					System.out.println("No!!!");
					System.out.println("답은 : "+dap);
				}
			}else if(answer==-1) {
				System.out.println("테스트 종료..");
				break;
			}else {
				System.out.println("1~4 사이 숫자를 입력하세요.");
			}
			
		}
		
	}
	

	// main
	public static void main(String[] args) {
		WordTestEx quiz = new WordTestEx();
		
		System.out.println("*** 영어단어 테스트 프로그램 \"명품영어\"입니다.");

		// 처음에 7개 들어있기
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("human", "인간"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("painting", "그림"));
		
		while (true) {
			System.out.print("단어테스트 : 1, 단어삽입 : 2, 종료: 3 >> ");
			int menu = input.nextInt();

			switch (menu) {
			case 1:
				quiz.checkAnswer();
				break;
			case 2:
				quiz.inputWord();
				System.out.println("단어 개수 : "+v.size());
				break;
			case 3:
				System.out.println("프로그램 종료..");
				System.exit(0);
			default:
				System.out.println("1~3사이 숫자만 입력하세요.");
			}

		}
		
		
		
		

		
	}// main end

}
