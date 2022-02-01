package qeue;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> que = new LinkedList<String>();
		que.add("1");
		que.add("2");
		que.add("3");
		Generic<String> get = new Generic<String>();
		get.addToColl(que);
		get.addToColl(que);
		
		System.out.println(que.isEmpty());
		System.out.println(Generic.<String>deleteAll(que).isEmpty());
		
		
	}

}
