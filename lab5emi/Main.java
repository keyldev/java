package lab5emi;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> is = new LinkedList<Integer>();
		LinkedList<Integer> two = new LinkedList<Integer>();
		is.add(1);
		is.add(2);
		is.add(3);
		is.add(4);
		two.add(5);
		two.add(1);
		two.add(2);
		two.add(4);
		
		System.out.println(Generic.<Integer>getIntersection(is, two).toString());
	}

}
