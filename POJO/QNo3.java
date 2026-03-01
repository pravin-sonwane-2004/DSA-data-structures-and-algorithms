// Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. 
//Store details of 5 cars using an array of objects. Perform the following operations:
// Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).
// Find the car with the best mileage.
// Display cars whose mileage is above the average mileage of all cars.
import java.util.*;

class Car {
	private int carId;
	private String model;
	private int fuelConsumed;
	private int distanceTravelled;
	
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public void setModel(String model) {
		this.model  = model;
	}
	public void setFuelConsumed(int fuelConsumed) {
		this.fuelConsumed = fuelConsumed;
	}
	public void setDistanceTravelled (int distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	public int getCarId() {
		return carId;
	}
	public String getModel () {
		return model;
	}
	public int getFuelConsumed() {
		return fuelConsumed;
	}
	public int getDistanceTravelled() {
		return distanceTravelled;
	}
}
class NewCar {
	private Car car [];
	void setCar(Car ...car) {
		this.car = car;
	}
	public int calcMilage(int distanceTravelled , int fuelConsumed) {
		int  mileage = 0;
		mileage = distanceTravelled / fuelConsumed;
		return mileage;
	}
	
}
class QNo3 {
	  void main() {    
	  Scanner sc = new Scanner(System.in);
		 Car [] cars = new Car[5];
		 NewCar nc = new NewCar();
		 for(int i=0;i<cars.length;i++) {
			 cars[i] = new Car();
			 IO.println("Enter Car Id : ");
			 cars[i].setCarId(sc.nextInt());
			 			 sc.nextLine();
			 IO.println("Enter Car Model : ");
			 cars[i].setModel(sc.nextLine());
			 IO.println("Enter Fuel Consumed : ");
			 cars[i].setFuelConsumed(sc.nextInt());
			 IO.println("Enter Distance Travelled : ");
			 cars[i].setDistanceTravelled(sc.nextInt());
			 IO.println("_____________________________");
		 }
		 nc.setCar(cars);
		 int average = 0;
		 int sum = 0;
		 for(int i=0;i<cars.length;i++) {
			 IO.println("Milage   " + nc.calcMilage(cars[i].getDistanceTravelled(),cars[i].getFuelConsumed()));
			 sum += nc.calcMilage(cars[i].getDistanceTravelled(),cars[i].getFuelConsumed());
	
		 }
		 average = sum/5;
		 IO.println("Average  " + average);
		 int count = 0;
		 for(int i=0;i<cars.length;i++) {
			 if(average <  nc.calcMilage(cars[i].getDistanceTravelled(),cars[i].getFuelConsumed())) {
					 IO.println("Thiese cars has milage more than average " + cars[i].getCarId() + " " + cars[i].getModel());
			 }
			  count++;
		 }
		
		  if(count<1){
			  IO.println("There is no car whose mileg is more than average");
		  }
		   
	  }
}