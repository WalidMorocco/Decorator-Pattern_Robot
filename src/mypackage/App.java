package mypackage;

import java.text.NumberFormat;

public class App {

	public static void main(String[] args) {

		NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out.println("Base Humanoid Robot:");
		Robot robot = new HumanoidRobot();
		System.out.println(robot.getDescription()
				+ "\n	" + robot.cost());
		
		System.out.println("\nKeyboard Added:");
		robot = new Keyboard(robot);
		System.out.println(robot.getDescription()
				+ "\n	" + robot.cost());
		
		System.out.println("\nMonitor Added:");
		robot = new Monitor(robot);
		System.out.println(robot.getDescription()
				+ "\n	" + robot.cost());
		
		
		System.out.println("\nNew Robot with Disk");
		Robot robot2 = new HumanoidRobot();
		robot2 = new Disk(robot2);
		System.out.println(robot2.getDescription()
				+ "\n	" + robot2.cost());
	}

}
