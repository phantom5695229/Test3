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
		System.out.println("品牌:"+brand);
		System.out.println("发动机名:"+engine.name);
		System.out.println("排气量:"+engine.ds);
		System.out.println("轮胎详情:");
		for (Wheel wheel : wheels) {
			System.out.println("\t品牌："+wheel.name);
			System.out.println("\t尺寸："+wheel.size);
		}
	}
}
public class Test1 {
	public static void main(String[] args) {
		Engine e = new Engine();
		e.name = "丰田";
		e.ds = 1.8;
		Wheel[] wheels = new Wheel[4];
		wheels[0] = new Wheel();
		wheels[1] = new Wheel();
		wheels[2] = new Wheel();
		wheels[3] = new Wheel();
		wheels[0].name = "固特异";
		wheels[0].size = 26;
		wheels[1].name = "米其林";
		wheels[1].size = 26;
		wheels[2].name = "马牌";
		wheels[2].size = 26;
		wheels[3].name = "耐跑";
		wheels[3].size = 26;
		
		Car c = new Car();
		c.brand = "骏派D60";
		c.engine = e;
		c.wheels = wheels;
		c.printCarDetails();
	}
}
