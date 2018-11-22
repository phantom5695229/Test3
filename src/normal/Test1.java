package normal;
class Person{
	String name;
	int age;
	public void setName(String n) {
		name = n ;
	}
	public void setAge(int a) {
		age = a ;
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("уехЩ");
		p1.setAge(20);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}

}
