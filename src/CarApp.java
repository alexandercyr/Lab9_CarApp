import java.util.Calendar;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		
		int totalCars = Validator.getInt(scnr, "How many cars are you entering: ", 0, Integer.MAX_VALUE);
		System.out.println();
		
		Car[] cars = new Car[totalCars];
		
		for(int i = 0; i < cars.length; i++) {
			String make = Validator.getString(scnr, "Enter Car #" + i + " Make: ");
			String model = Validator.getString(scnr, "Enter Car #" + i + " Model: ");
			int year = Validator.getInt(scnr, "Enter Car #" + i + " Year: ", 1900, Calendar.getInstance().get(Calendar.YEAR)+ 1);
			double price = Validator.getDouble(scnr, "Enter Car #" + i + " Price: ", 0, Double.MAX_VALUE);
			
			cars[i] = new Car(make, model, year, price);
			System.out.println();
		}
		
		System.out.println("Current Inventory:");
		
		for(Car car: cars) {
			System.out.println(car.toString());
		}		
		
		scnr.close();
	}

}
