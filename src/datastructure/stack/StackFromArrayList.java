package datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class StackFromArrayList {
	private int max;
	private List<Integer> list ;
	
	public StackFromArrayList(int size){
		max = size;
		list = new ArrayList<Integer>(max);
	}
	
	public void push(int item){
		list.add(item);
	}
	public int pop(){
		Integer i =  (Integer) list.get(list.size()-1);
		return i;
	}
	public boolean isEmpty(){
		if(list.size() == 0)
			return true;
		else
			return false;
	}
	public int peek(){
		return list.get(list.size()-1);
	}
	public boolean isFull(){
		if(list.size() == max)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		StackFromArrayList sfa = new StackFromArrayList(5);
		System.out.println(sfa.isEmpty());
		sfa.push(1);
		sfa.push(2);
		sfa.push(3);
		sfa.push(4);
		sfa.push(5);
		
		System.out.println(sfa.pop());
		
		System.out.println(sfa.isFull());
	}
	
}
