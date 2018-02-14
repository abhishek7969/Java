package datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class StackFromArrayList {
	private int max;
	private List<Integer> list ;
	private int top;
	
	public StackFromArrayList(int size){
		max = size;
		list = new ArrayList<Integer>(max);
		top = -1;
	}
	
	public void push(int item){
		list.add(item);
		top++;
	}
	public int pop(){
		Integer i =  (Integer) list.get(top);
		top = top-1;
		return i;
	}
	public boolean isEmpty(){
		if(top == -1)
			return true;
		else
			return false;
	}
	public int peek(){
		return list.get(top);
	}
	public boolean isFull(){
		if(top == max-1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		StackFromArrayList sfa = new StackFromArrayList(5);
		System.out.println(sfa.isEmpty());
		sfa.push(12);
		sfa.push(122);
		
		sfa.pop();
		System.out.println(sfa.pop());
		System.out.println(sfa.pop());
		System.out.println(sfa.pop());

		System.out.println(sfa.peek());
	}
	
}
