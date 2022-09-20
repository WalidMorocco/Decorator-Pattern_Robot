package mypackage;

public class Controller extends HardwareDecorator {

	Robot robot;

	public Controller(Robot robot) {
		this.robot = robot;
	}
	
	public String getDescription() {
		return robot.getDescription() + " + Controller";
	}

	public double cost() {
		return 69.99 + robot.cost();
	}

}
