package mypackage;

public class Drive extends HardwareDecorator {

	Robot robot;

	public Drive(Robot robot) {
		this.robot = robot;
	}
	
	public String getDescription() {
		return robot.getDescription() + " + Drive";
	}

	public double cost() {
		return 79.99 + robot.cost();
	}

}
