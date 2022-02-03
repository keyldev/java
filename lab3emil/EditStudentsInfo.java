package lab3emil;

import java.util.List;

public class EditStudentsInfo implements IStudentProvider {
	List<Student> students;
	public EditStudentsInfo(List<Student> lst) {
		this.students = lst;
	}
	// ����������� �������������� ����
	@Override
	public void displayInfo() {
		for(Student st: students) {
			System.out.printf("��� %s ,������ %s,��������? %s\n", st.getName(), st.getStudentGroup(), st.getIsElder());
		}
		
	}

// ���������� ��������� ��������
	@Override
	public void editInfo(Student newStudent) {
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getStudentID() == newStudent.getStudentID()) {
				students.set(i ,newStudent);
			}
		}
		
	}

}
