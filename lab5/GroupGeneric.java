package lab5;

import java.util.*;

public class GroupGeneric<T> {
	private Collection<T> defaultList;
	
	public void add(Collection<T>object){
		if(defaultList == null)
			this.defaultList =  object;
		else 
			System.out.println("Error: Use addToFinished(List) method");
	}
	// добавить 1 элемент циклического списка 
	public boolean add(T element) {
		defaultList.add(element);
		return true;
	}
	//----
	public boolean addToFinished(Collection<T> collection) {
		if(defaultList == null || defaultList.isEmpty()) {
			System.out.println("Use add method to add a new objects group");
			return false;
		}
		else {
			System.out.println("Collection before:\n" + defaultList);
			for(int i = 0; i < collection.size(); i++)
			{
				defaultList.add((T) ((List<T>) collection).get(i));
			}
			System.out.println("added to created collection\n" + defaultList);
			return true;
		}
		
	}
	
	public void printObjects() {
		for(T temp : defaultList)
			System.out.printf("printed: %s \t", temp);
	}
	
	public static <I> List<I> getOdd(List<I> list) { // нечетные элементы из входной группы 
		List<I> lst = new LinkedList<I>();
		for(int i = 0; i < list.size(); i++)
		{
			if(i % 2 == 0) lst.add(list.get(i));
			else continue;
		}
		return lst;
	}
	
}
