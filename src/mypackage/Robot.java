package mypackage;

public abstract class Robot {
	String description = "Base Robot";
	
	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
