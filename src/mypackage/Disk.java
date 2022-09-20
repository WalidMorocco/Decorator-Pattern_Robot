package mypackage;

public class Disk extends HardwareDecorator {

	Robot robot;

	public Disk(Robot robot) {
		this.robot = robot;
	}
	
	public String getDescription() {
		return robot.getDescription() + " + Disk";
	}

	public double cost() {
		return 19.99 + robot.cost();
	}

}
