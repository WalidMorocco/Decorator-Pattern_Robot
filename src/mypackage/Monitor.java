package mypackage;

public class Monitor extends HardwareDecorator {

	Robot robot;

	public Monitor(Robot robot) {
		this.robot = robot;
	}
	
	public String getDescription() {
		return robot.getDescription() + " + Monitor";
	}

	public double cost() {
		return 149.99 + robot.cost();
	}

}
