package lesson;

public class TestLesson {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("ÀÏÍõ");
		Lesson l1 = new Lesson();
		l1.setStudent(s1);
		l1.teach("JAVA");
	}

}
