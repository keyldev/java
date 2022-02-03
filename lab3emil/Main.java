package lab3emil;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int idCounter = 0;
		// TODO Auto-generated method stub
		List<Student> lst = new ArrayList<Student>();
		
		lst.add(new Student(idCounter++,"Иван","111",false));
		lst.add(new Student(idCounter++,"Петя","222",true));
		lst.add(new Student(idCounter++,"Саша","222",false));
		lst.add(new Student(idCounter++,"Коля","111",true));
		lst.add(new Student(idCounter++,"Витя","222",false));
		lst.add(new Student(idCounter++,"Митя","111",false));
		
		//меняем Коля -> Новое имя
		lst.get(3).setStudentName("Новое имя");
		
		//просто отобразить инфу
		DisplayStudentsInfo display = new DisplayStudentsInfo(lst);
		display.displayInfo();
		
		
		//эдит инфу
		EditStudentsInfo edit = new EditStudentsInfo(lst);
		edit.displayInfo();
		
		System.out.println();
		
		edit.editInfo(lst.get(3));
		edit.displayInfo();
	}

}
