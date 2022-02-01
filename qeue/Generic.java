package qeue;

import java.util.*;
public class Generic<T> {
	
	
	private Queue<T> que;
	public void addToColl(Collection<T> coll) {
		this.que = (Queue<T>) coll;
		for(T ob : que) {
			System.out.println(ob.toString());
//			System.out.print(true);
		}
	}
	public static <T> Collection<T> deleteAll(Collection<T> coll) {
		Queue<T> queue = (Queue<T>)coll;
		for(T ob: queue) {
			System.out.println(ob.toString());
		}
		queue.clear();
		for(T ob: queue) {
			if(queue.isEmpty())
				System.out.print("False");
			System.out.println(ob.toString());
		}
		return queue;
	}
	
	
}
