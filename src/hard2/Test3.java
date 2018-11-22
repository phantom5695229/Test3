package hard2;
class Person{
	int age;
	public Person getPerson(){
		Person p = new Person();
		p.age = ++age;
		return p;
	}
}

public class Test3 {
	public static void main(String[] args) {
		Person per = new Person();
		per.age = 1;
		Person p2 = per.getPerson();
		Person p3 = per.getPerson();
		Person p4 = per.getPerson();
		System.out.println(per.age+" "+p2.age+" "+p3.age+" "+p4.age);
	}

}
