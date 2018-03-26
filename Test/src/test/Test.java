package test;

import source.Car;
import source.Plane;
import source.Transportation;

public class Test {
	public static void main(String[] args) {
		// creating car1
		Car car1 = new Car("NF123456", 147, 200, "green", "personal vehicle");
		// creating car2
		Car car2 = new Car("NF654321", 150, 195, "blue", "personal vehicle");
		// comparing car1 with car2 to check if they are the same vehicle
		if (car1.equals(car2)) {
			System.out.println("car1 and car2 are the same car.");
		} else {
			System.out.println("car1 and car2 are not the same car.");
		}
		System.out.println("==============================");

		// creating plane1
		Plane plane1 = new Plane("LN1234", 1000, 30, 2, 10, "jet plane");
		// asking the plane to fly and print its details
		plane1.fly();
		System.out.println("==============================");

		// asking the car to drive and print its details
		car1.drive();

		// creating "boat" as one of the transportations
		Transportation boat = new Transportation();
		boat.setRegistration("ABC123");
		boat.setEnginePower(100);
		boat.setMaximalSpeed(30);
		boat.setGrossTonnage(500);
	}

}
