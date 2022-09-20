package mypackage;

public class Keyboard extends HardwareDecorator {

	Robot robot;

	public Keyboard(Robot robot) {
		this.robot = robot;
	}
	
	public String getDescription() {
		return robot.getDescription() + ", Keyboard";
	}

	public double cost() {
		return 49.99 + robot.cost();
	}

}
