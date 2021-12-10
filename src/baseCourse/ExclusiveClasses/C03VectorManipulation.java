package baseCourse.ExclusiveClasses;

import java.util.Scanner;

public class C03VectorManipulation {
    public static void main(String[] args){
        Scanner valueReader = new Scanner(System.in);

        String[] registeredCars = new String[5];
        int carsQuantity[] = {1,2,3,5};

        registeredCars[0] = "Ferrari";
        registeredCars[1] = "Lamborghini";
        registeredCars[2] = "BMW";
        registeredCars[3] = "Maserati";
        registeredCars[4] = "Bugatti";

        System.out.println("Insert the car ID number to see detailed info = ");
        int carID = valueReader.nextInt();

        for(int counter = 0; counter < 5; counter++){
            if(carID == counter){
                System.out.println(registeredCars[counter] + ". Quantity = " + carsQuantity[counter]);
            }
        }
    }
}