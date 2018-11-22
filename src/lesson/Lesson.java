package lesson;

public class Lesson {
	Student student;
	public void setStudent(Student s){
		student = s;
	}
	public Student getStudent(){
		return student;
	}
	public void teach(String subject){
		System.out.println("老师教"+student.name+"学"+subject);
	}
}
