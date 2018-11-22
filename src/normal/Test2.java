package normal;
class Student{
	String name;
	public void setStudent(String n){
		name = n;
	}
	public String getStudent(){
		return name;
	}
}
class Teacher{
	String subject;
	public void setSubject(String s){
		subject = s;
	}
	public String getSubject(){
		return subject;
	}
	
}
class School{
	Student s;
	Teacher t;
	public void setStudent(Student ss){
		s = ss;
	}
	public Student getStudent(){
		return s;
	}
	public void setTeacher(Teacher tt){
		t= tt;
	}
	public Teacher getTeacher(){
		return t;
	}
	public void print(){
		System.out.println("老师在教"+s.name+t.subject);
	}
}
public class Test2 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setStudent("王旭东");
		
		Teacher tea = new Teacher();
		tea.setSubject("JAVA");
		
		School school = new School();
		school.setStudent(stu);
		school.setTeacher(tea);
		school.print();
	}

}