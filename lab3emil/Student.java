package lab3emil;

public class Student {
	private int studentID = 0;
	public int getStudentID() {
		return this.studentID;
	}
	public void setStudentID(int id) {
		this.studentID = id;
	}
	//имя
	private String studentName;
	public String getName() {
		return this.studentName;
	}
	public void setStudentName(String name) {
		this.studentName = name;
	}
	//группа
	private String studentGroup;
	public String getStudentGroup() {
		return this.studentGroup;
	}
	public void setStudentGroup(String group) {
		this.studentGroup = group;
	}
	//староста
	private boolean isElder = false;
	public boolean getIsElder() {
		return this.isElder;
		}
	public void setIsElder(boolean isElder) {
		this.isElder = isElder;
	}
	
	public Student(int id, String name, String group, boolean isElder) {
		this.studentID = id;
		this.studentName = name;
		this.studentGroup = group;
		this.isElder = isElder;
	}
}
