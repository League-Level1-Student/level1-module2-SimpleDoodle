package _06_minion;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;

	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	public String getName() {
		System.out.println("My name is " + name + ".");
		return "";
	}

	public String getEyes() {
		System.out.println(name + " has " + eyes + " eye(s).");
		return "";
	}

	public String getColor() {
		System.out.println(name + " is " + color + ".");
		return "";
	}

	public String getMaster() {
		if (master.equalsIgnoreCase("")) {
			System.out.println(name + " has no master.");
		} else {
			System.out.println(name + "'s master is " + master + ".");
		}
		return "";
	}

	public String setMaster(String master) {
		this.master = master;
		return "";
	}
}
