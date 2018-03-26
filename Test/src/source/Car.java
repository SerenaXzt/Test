package source;

public class Car extends Transportation {
	public Car() {
		super();
	}

	public Car(String licensePlate, int enginePower, int maximalSpeed, String color, String type) {
		super();
		this.licensePlate = licensePlate;
		this.enginePower = enginePower;
		this.maximalSpeed = maximalSpeed;
		this.color = color;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Car otherCar = (Car) obj;
		if (licensePlate == null) {
			if (otherCar.licensePlate != null) {
				return false;
			}
		} else if (!licensePlate.equals(otherCar.licensePlate)) {
			return false;
		}
		if (enginePower != otherCar.enginePower) {
			return false;
		}
		if (maximalSpeed != otherCar.maximalSpeed) {
			return false;
		}
		if (color == null) {
			if (otherCar.color != null) {
				return false;
			}
		} else if (!color.equals(otherCar.color)) {
			return false;
		}
		if (type == null) {
			if (otherCar.type != null) {
				return false;
			}
		} else if (!type.equals(otherCar.type)) {
			return false;
		}

		return true;
	}

	public void drive() {
		System.out.println("Car is driving...");
		showCarDetails(this);
	}
}
