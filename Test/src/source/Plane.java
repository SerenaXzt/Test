package source;

public class Plane extends Transportation {
	public Plane() {
		super();
	}

	public Plane(String registration, int enginePower, int wingspan, int loadCapacity, int netWeight,
			String flyingClass) {
		super();
		this.registration = registration;
		this.enginePower = enginePower;
		this.wingspan = wingspan;
		this.loadCapacity = loadCapacity;
		this.netWeight = netWeight;
		this.flyingClass = flyingClass;
	}

	public void fly() {
		System.out.println("Plane is flying...");
		showPlaneDetails(this);
	}
}
