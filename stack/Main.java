package stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<Integer> gen = new Generic<Integer>();
		
		Stack<Integer> st = new Stack<Integer>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		gen.addGroup(st);
		st = new Stack<Integer>();
		st.add(6);
		st.add(7);
		gen.addGroup(st);
		System.out.println(Generic.<Integer>invertCollection(st).toString()); // sorts 2 new objects (6,7) -> (7,6), delete to achieve a normal result
	}

}
