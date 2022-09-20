package mypackage;

import java.text.NumberFormat;

public class App {

	public static void main(String[] args) {

		NumberFormat nf = NumberFormat.getCurrencyInstance();

		Robot robot = new HumanoidRobot();
		
		System.out.println(robot.getDescription()
				+ "\n	" + robot.cost());
		
		robot = new Keyboard(robot);
		
		System.out.println(robot.getDescription()
				+ "\n	" + robot.cost());
		
	}

}
