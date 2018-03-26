package source;

public class Transportation {
	protected String licensePlate;
	protected int enginePower;
	protected int maximalSpeed;
	protected String color;
	protected String type;
	protected String registration;
	protected int wingspan;
	protected int loadCapacity;
	protected int netWeight;
	protected String flyingClass;
	protected int grossTonnage;

	public Transportation() {
		super();
	}

	public Transportation(String licensePlate, int enginePower, int maximalSpeed, String color, String type,
			String registration, int wingspan, int loadCapacity, int netWeight, String flyingClass, int grossTonnage) {
		super();
		this.licensePlate = licensePlate;
		this.enginePower = enginePower;
		this.maximalSpeed = maximalSpeed;
		this.color = color;
		this.type = type;
		this.registration = registration;
		this.wingspan = wingspan;
		this.loadCapacity = loadCapacity;
		this.netWeight = netWeight;
		this.flyingClass = flyingClass;
		this.grossTonnage = grossTonnage;
	}

	public Transportation(String licensePlate, int enginePower, int maximalSpeed, String color, String type) {
		super();
		this.licensePlate = licensePlate;
		this.enginePower = enginePower;
		this.maximalSpeed = maximalSpeed;
		this.color = color;
		this.type = type;
	}

	public Transportation(String registration, int enginePower, int wingspan, int loadCapacity, int netWeight,
			String flyingClass) {
		super();
		this.registration = registration;
		this.enginePower = enginePower;
		this.wingspan = wingspan;
		this.loadCapacity = loadCapacity;
		this.netWeight = netWeight;
		this.flyingClass = flyingClass;
	}

	public Transportation(String registration, int enginePower, int maximalSpeed, int grossTonnage) {
		super();
		this.registration = registration;
		this.enginePower = enginePower;
		this.maximalSpeed = maximalSpeed;
		this.grossTonnage = grossTonnage;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}

	public int getMaximalSpeed() {
		return maximalSpeed;
	}

	public void setMaximalSpeed(int maximalSpeed) {
		this.maximalSpeed = maximalSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public int getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(int netWeight) {
		this.netWeight = netWeight;
	}

	public String getFlyingClass() {
		return flyingClass;
	}

	public void setFlyingClass(String flyingClass) {
		this.flyingClass = flyingClass;
	}

	public int getGrossTonnage() {
		return grossTonnage;
	}

	public void setGrossTonnage(int grossTonnage) {
		this.grossTonnage = grossTonnage;
	}

	public void showCarDetails(Transportation car) {
		System.out.println("Car Details: \n" + "licensePlate: " + licensePlate + "\n" + "engine power: " + enginePower
				+ "kW\n" + "maximal speed: " + maximalSpeed + "km/h\n" + "color: " + color + "\n" + "type: " + type);
	}

	public void showPlaneDetails(Transportation plane) {
		System.out.println("Plane Details: \n" + "registration: " + registration + "\n" + "engine power: " + enginePower
				+ "kW\n" + "wingspan: " + wingspan + "m\n" + "load capacity: " + loadCapacity + "t\n" + "net weight: "
				+ netWeight + "t\n" + "flying class: " + flyingClass);
	}

	public void showBoatDetails(Transportation boat) {
		System.out.println("Boat Details: \n" + "registration: " + registration + "\n" + "engine power: " + enginePower
				+ "kW\n" + "maximal speed: " + maximalSpeed + " knot per hour\n" + "gross tonnage: " + grossTonnage
				+ "kg");
	}
}
