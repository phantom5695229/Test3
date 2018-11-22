package time;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setName("卡车");
		c1.setSpeed(80.0);
		
		Car c2 = new Car();
		c2.setName("高铁");
		c2.setSpeed(400.0);
		
		Driver d1 = new Driver();
		d1.setCar(c2);
		d1.setName("老王");
		d1.drive(1000);
	}

}
