package stack_genericExam;

public class Mystack<T> implements IStack<T> {
	private int num;
	private Object[] stck;

	public Mystack() {
		num = 0;
		stck = new Object[10];
	}
	
	@Override
	public T pop() {
		if(num==0) {
			return null;
		}
		num--;
		return (T)stck[num];
	}

	@Override
	public boolean push(T ob) {
		stck[num] = ob;
		num++;
		if(num == 10) {
			return false;
		}else {
			return true;
		}
	}

}
