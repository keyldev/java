package stack;

import java.util.*;

public class Generic<T>{
	//fix initialization
	private Collection<T> defaultCollection = new Stack<T>();
	public void addGroup(Stack<T> group) {
		if(defaultCollection != null) // mozhno udalit
		{
			for(int i = 0; i < group.size(); i++)
			{
				this.defaultCollection.add(group.get(i)); // this is for adding to ready stack
			}
		}
		else this.defaultCollection = group; // if null 
		System.out.println("debug-----\n" + defaultCollection.toString());
	}

	public static <T> Collection<T> invertCollection(Collection<T> group){
		Stack<T> st = (Stack<T>)group;
		st.sort(Collections.reverseOrder());
		return st;
	}
	
}
