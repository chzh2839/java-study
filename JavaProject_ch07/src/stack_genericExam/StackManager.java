package stack_genericExam;

// �ǽ����� 9��
public class StackManager {
	public static void main(String[] args) {
		IStack<Integer> stack = new Mystack<Integer>();
		for(int i=0; i<10; i++) {
			stack.push(i); // 10�� ���� Ǫ��
		}
		while(true) { // ������ �������� pop
			Integer n = stack.pop();
			if(n==null) {
				break;
			}
			
			System.out.print(n+" ");
		}
	}

}
