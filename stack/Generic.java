package stack;

import java.util.*;

public class Generic<T>{
	private Collection<T> defaultCollection = new Stack<T>();
	public void addGroup(Stack<T> group) {
		if(defaultCollection != null)
		{
			for(int i = 0; i < group.size(); i++)
			{
				this.defaultCollection.add(group.get(i));
			}
		}
		else this.defaultCollection = group;
		System.out.println("debug-----\n" + defaultCollection.toString());
	}

	public static <T> Collection<T> invertCollection(Collection<T> group){
		Stack<T> st = (Stack<T>)group;
		st.sort(Collections.reverseOrder());
		return st;
	}
	
}
