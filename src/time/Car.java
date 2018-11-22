package time;

public class Car {
	String name;
	double speed;
	public void setName(String n) {
		name = n;
	}
	public void setSpeed(double s) {
		speed = s;
	}
	public String getName(){
		return name;
	}
	public double getSpeed(){
		return speed;
	}
	public double run(double kiro){
		double time;
		time = kiro / speed ;
		return time;
	}
}
