package stack_genericExam;

// 실습문제 9번
public class StackManager {
	public static void main(String[] args) {
		IStack<Integer> stack = new Mystack<Integer>();
		for(int i=0; i<10; i++) {
			stack.push(i); // 10개 정수 푸시
		}
		while(true) { // 스택이 빌때까지 pop
			Integer n = stack.pop();
			if(n==null) {
				break;
			}
			
			System.out.print(n+" ");
		}
	}

}
