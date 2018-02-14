package datastructure.stack;

/**
 * Stack implementation
 * @author Abhishek.Kumar
 *
 */

public class MyStack {

	private int top;
	private long[] stackArray;
	private int maxSize;

	public MyStack(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;

	}

	public void push(int item) {
		stackArray[++top] = item;
	}

	public long pop() {
		return stackArray[top--];
	}

	public boolean isEmpty() {
		if (top == -1)
			return Boolean.TRUE;
		else
			return Boolean.FALSE;
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isStackFull() {
		if (top == maxSize - 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		MyStack ms = new MyStack(5);
		System.out.println(ms.isEmpty());
		ms.push(4);
		ms.push(0);
		ms.push(24);
		ms.push(30);
		ms.push(14);
		System.out.println(ms.isEmpty());
		System.out.println(ms.isStackFull());
		System.out.println(ms.pop());
	}
}
