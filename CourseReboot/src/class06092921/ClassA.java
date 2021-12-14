package class06092921;

import java.util.Scanner;

public class ClassA {
	// Single line comment

	/*
	 * Multiple lines comment
	 * */

	/**
	 * Project documentation (Example: javadoc)
	 * 
	 */

	float gasolineQuantity = 80.5f;

	public void showGasolineStatus() {
		if(gasolineQuantity >= 75f && gasolineQuantity <= 100f) {
			System.out.println("Fuel level = GREEN");
		}else {
			System.out.println("Fuel level = RED");
		}
	}

	public void showNewGasolineStatus() {
		if(gasolineQuantity >= 75f && gasolineQuantity <= 100f){ 
			System.out.println("Fuel level = GREEN");
		}else if(gasolineQuantity >= 50f && gasolineQuantity < 75f) {
			System.out.println("Fuel level = YELLOW");
		}else{
			System.out.println("Fuel level = RED");
		}
	}

	// Method 01 with return
	public String showCarMarksByLetter() {
		System.out.println("Insert your desired car mark initial letter = ");
		Scanner userInsertion = new Scanner(System.in);
		String typedLetter = userInsertion.next();
		String systemAnswer = null;
		
		switch(typedLetter) {
		case "L":
			systemAnswer = "Lotus";
			break;
		case "B":
			systemAnswer = "BMW";
			break;
		case "F":
			systemAnswer = "Ferrari";
			break;
		default: 
			systemAnswer = "Error! Vehicle mark not found. Please, try again!";
			break;
		}
		return systemAnswer;
	}
	
	// Method 02 without return (Void)
	public void showVehicleEngines() {
		System.out.println("=== Show vehicle models with the selected engine ===");
		System.out.println("Insert the vehicle engine types = ");
		
		Scanner typedEngine = new Scanner(System.in);
		String outputMessage = typedEngine.next();
		
		switch(outputMessage) {
		case "V8":
			System.out.println("Cars with V8 engine = ");
			System.out.println("Lamborghini");
			System.out.println("BMW");
			System.out.println("Maserati");
			break;
		case "V6":
			System.out.println("Cars with V6 engine = ");
			System.out.println("BMW");
			System.out.println("Volkswagen");
			System.out.println("Shelby");
			break;
		case "V12":
			System.out.println("Cars with V12 engine = ");
			System.out.println("Ferrari");
			System.out.println("Bugatti");
			System.out.println("Lamborghini");
			break;
		default:
			System.out.println("Error! Unknown engine type. Please, insert this information again.");
			break;
		}
	}
}
