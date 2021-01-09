package word_test_game;

import java.util.Scanner;
import java.util.Vector;

// ����ç���� & �ǽ�����12��
public class WordTestEx {
	private static Scanner input = new Scanner(System.in);
	private static Vector<Word> v = new Vector<Word>();
	private static int dap = 0;

	
	// �ܾ� �����ϱ�
	public void inputWord() {
		System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
		int n = v.size();
		System.out.println("���� ����� �ܾ� ���� : "+n);
		
		// �Է¹޾� �� �����ϱ�
		while (true) {
			System.out.print("���� �ѱ� >>");
			String eng = input.next();

			if (eng.equals("�׸�")) {
				System.out.println("�ܾ���� ��");
				break;
			}
			
			String kor = input.next();
			
			// �ߺ�Ȯ��
			for(int i=0; i<v.size(); i++) {
				Word w = v.get(i);
				if(w.getEng().equals(eng)) {
					System.out.println("�ߺ��� �ܾ �����մϴ�.");
					continue;
				}
			}
			v.add(new Word(eng, kor));
			n++;

		} // while end
		

	}

	// ���� �߻� �޼���
	private int randomNum(int limit) {
		double n = Math.random() * limit;
		return (int) n;
	}

	// ��������
	private void giveQuestion() {
		String[] s = new String[4];

		while (true) {
			// �ݺ��Ҷ����� �����߻�
			int index = randomNum(v.size()); // ������ ����
			Word w = v.get(index);
			String e = w.getEng();
			String k = w.getKor();

			boolean check = false;

			// ���� �迭�� ����
			for (int i = 0; i < 4; i++) {
				int n = randomNum(v.size());
				s[i] = v.get(n).getKor();
			}
			
			// ��Ȯ��
			for(int i =0; i<4; i++) {
				if (s[i].equals(k)) {
					check = true;
					dap = i + 1; // �� ����!
				}
			}

			// ���� �迭 �ȿ� ������ ���� ���
			if (check) {
				System.out.println(e + "?"); // ����
				for (int i = 0; i < 4; i++) {
					System.out.print("(" + (i+1) + ")" + s[i] + "\t"); // ����
				}
				break;
			}

		} // while end

	}

	// ���� ����Ȯ��
	public void checkAnswer() {
		System.out.println("\"��ǰ����\"�� �ܾ��׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� " + v.size() + "���� �ܾ ����ֽ��ϴ�.");
		
		while(true) {
			giveQuestion(); // ���� ��
			
			System.out.print("���� >> ");
			int answer = input.nextInt();

			if(answer>0 && answer<5) {
				if (answer == dap) {
					System.out.println("Excellent!!");
				}else {
					System.out.println("No!!!");
					System.out.println("���� : "+dap);
				}
			}else if(answer==-1) {
				System.out.println("�׽�Ʈ ����..");
				break;
			}else {
				System.out.println("1~4 ���� ���ڸ� �Է��ϼ���.");
			}
			
		}
		
	}
	

	// main
	public static void main(String[] args) {
		WordTestEx quiz = new WordTestEx();
		
		System.out.println("*** ����ܾ� �׽�Ʈ ���α׷� \"��ǰ����\"�Դϴ�.");

		// ó���� 7�� ����ֱ�
		v.add(new Word("love", "���"));
		v.add(new Word("animal", "����"));
		v.add(new Word("bear", "��"));
		v.add(new Word("eye", "��"));
		v.add(new Word("human", "�ΰ�"));
		v.add(new Word("picture", "����"));
		v.add(new Word("painting", "�׸�"));
		
		while (true) {
			System.out.print("�ܾ��׽�Ʈ : 1, �ܾ���� : 2, ����: 3 >> ");
			int menu = input.nextInt();

			switch (menu) {
			case 1:
				quiz.checkAnswer();
				break;
			case 2:
				quiz.inputWord();
				System.out.println("�ܾ� ���� : "+v.size());
				break;
			case 3:
				System.out.println("���α׷� ����..");
				System.exit(0);
			default:
				System.out.println("1~3���� ���ڸ� �Է��ϼ���.");
			}

		}
		
		
		
		

		
	}// main end

}
