package mypackage;

public class Wheel extends HardwareDecorator {

	Robot robot;

	public Wheel(Robot robot) {
		this.robot = robot;
	}
	
	public String getDescription() {
		return robot.getDescription() + " + Wheel";
	}

	public double cost() {
		return 29.79 + robot.cost();
	}

}
