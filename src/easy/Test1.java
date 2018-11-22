package easy;
class Engine{
	String name;
	double ds;
}
class Wheel{
	String name;
	int size;
}
class Car{
	String brand;
	Engine engine;
	Wheel[] wheels;
	public void printCarDetails(){
		System.out.println("Ʒ��:"+brand);
		System.out.println("��������:"+engine.name);
		System.out.println("������:"+engine.ds);
		System.out.println("��̥����:");
		for (Wheel wheel : wheels) {
			System.out.println("\tƷ�ƣ�"+wheel.name);
			System.out.println("\t�ߴ磺"+wheel.size);
		}
	}
}
public class Test1 {
	public static void main(String[] args) {
		Engine e = new Engine();
		e.name = "����";
		e.ds = 1.8;
		Wheel[] wheels = new Wheel[4];
		wheels[0] = new Wheel();
		wheels[1] = new Wheel();
		wheels[2] = new Wheel();
		wheels[3] = new Wheel();
		wheels[0].name = "������";
		wheels[0].size = 26;
		wheels[1].name = "������";
		wheels[1].size = 26;
		wheels[2].name = "����";
		wheels[2].size = 26;
		wheels[3].name = "����";
		wheels[3].size = 26;
		
		Car c = new Car();
		c.brand = "����D60";
		c.engine = e;
		c.wheels = wheels;
		c.printCarDetails();
	}
}
