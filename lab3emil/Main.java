package lab3emil;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int idCounter = 0;
		// TODO Auto-generated method stub
		List<Student> lst = new ArrayList<Student>();
		
		lst.add(new Student(idCounter++,"����","111",false));
		lst.add(new Student(idCounter++,"����","222",true));
		lst.add(new Student(idCounter++,"����","222",false));
		lst.add(new Student(idCounter++,"����","111",true));
		lst.add(new Student(idCounter++,"����","222",false));
		lst.add(new Student(idCounter++,"����","111",false));
		
		//������ ���� -> ����� ���
		lst.get(3).setStudentName("����� ���");
		
		//������ ���������� ����
		DisplayStudentsInfo display = new DisplayStudentsInfo(lst);
		display.displayInfo();
		
		
		//���� ����
		EditStudentsInfo edit = new EditStudentsInfo(lst);
		edit.displayInfo();
		
		System.out.println();
		
		edit.editInfo(lst.get(3));
		edit.displayInfo();
	}

}
