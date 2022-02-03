package lab5emi;

import java.util.Collection;
import java.util.LinkedList;

public class Generic<T> {
	private LinkedList<T> col = new LinkedList<T>();

	
	public void addOne(T element) {
		col.addLast(element); // ��������� ������� � �����
	}
	public void addFirst(T element) {
		col.addFirst(element); // ��������� ������� � ������
	}
	public void addGroup(Collection<T> col) {
		col.addAll(col);
	}
	
	public static <T> LinkedList<T> getIntersection(LinkedList<T> group, LinkedList<T> secondGroup){
		LinkedList<T> result = new LinkedList<T>(); // ��������������
		int size = (group.size() > secondGroup.size()) ? group.size() : secondGroup.size(); // �������� ������� ������ (���� ����������� ���-�� �� �������)
		for(int i = 0; i < size; i++) {
			if(group.contains(secondGroup.get(i))) { // ���� ��������, �� ���������
				result.add(secondGroup.get(i));
			}
		}
		return result; // ���������� ��� ������� ����
	}
	
	
}
