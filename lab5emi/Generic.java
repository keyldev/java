package lab5emi;

import java.util.Collection;
import java.util.LinkedList;

public class Generic<T> {
	private LinkedList<T> col = new LinkedList<T>();

	
	public void addOne(T element) {
		col.addLast(element); // добавляет элемент в конец
	}
	public void addFirst(T element) {
		col.addFirst(element); // добавляет элемент в начало
	}
	public void addGroup(Collection<T> col) {
		col.addAll(col);
	}
	
	public static <T> LinkedList<T> getIntersection(LinkedList<T> group, LinkedList<T> secondGroup){
		LinkedList<T> result = new LinkedList<T>(); // результирующий
		int size = (group.size() > secondGroup.size()) ? group.size() : secondGroup.size(); // получаем размеры листов (лень придумывать что-то по другому)
		for(int i = 0; i < size; i++) {
			if(group.contains(secondGroup.get(i))) { // если контейнс, то добавляем
				result.add(secondGroup.get(i));
			}
		}
		return result; // вощвращаем наш бутифул лист
	}
	
	
}
