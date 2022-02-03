package lab3emil;

import java.util.List;

public class DisplayStudentsInfo implements IStudentProvider {

	List<Student> students;
	public DisplayStudentsInfo(List<Student> students) {
		this.students = students;
	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		for(Student st : students) {
			System.out.printf("ID: %d, Имя студента: %s, группа: %s, староста?: %s\n",st.getStudentID(), st.getName(), st.getStudentGroup(), st.getIsElder());
		}
	}

	@Override
	public void editInfo(Student info) {
		// TODO Auto-generated method stub
		
	}


}
