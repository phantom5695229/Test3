package time;

public class Driver {
	String name;
	Car car;
	public void setName(String n) {
		name = n;
	}
	public void setCar(Car c) {
		car = c;
	}
	public String getName() {
		return name;
	}
	public Car getCar() {
		return car;
	}
	
	public void drive(double kiro) {
		System.out.println(name+"��"+car.getName()+"��ʻ"+kiro+"��������ʱ��Ϊ"+car.run(kiro)+"Сʱ");
	}
	
}
