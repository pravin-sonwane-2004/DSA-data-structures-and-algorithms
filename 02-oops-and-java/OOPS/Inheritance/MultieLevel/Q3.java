// 3) Vehicle → Car → ElectricCar
// Create three classes:
// • Vehicle
// o brand
// o start()
// • Car (inherits Vehicle)
// o model
// o displayCar()
// • ElectricCar (inherits Car)
// o batteryCapacity
// o displayElectricCar()
// Task: Display full details of electric car.

class Vehicle{
	String brand;
	void start() {
		IO.println("Starting....");
	}
}
class Car extends Vehicle {
	int model;
	void displayCar () {
		
		
	}
}
class ElectricCar extends Car {
	
}

class Q3 {
	void main() {
		
	}
}