package baseCourse.exercises.module03;

import java.util.Scanner;

public class l05BCheeseburger extends l05AMeal{
    // TODO - Step 04 = Create a 10 ingredients vector
    private String mainMeat;
    private float mainMeatPrice = 5.0f;
    private String extraChoice;
    private float extraChoicePrice = 2.5f;
    private String drinkChoice;
    private float drinkChoicePrice = 3.0f;

    @Override
    public void setTotalPreparationTime(){
        totalPreparationTime = 25;
    }

    // "Calculate total order price" method
    @Override
    public void calculateTotalOrderPrice(){
        totalOrderPrice += mainMeatPrice + extraChoicePrice + drinkChoicePrice;
        System.out.println("Total order price = R$ " + totalOrderPrice + ".");
    }

    // "Calculate deliver time" method
    @Override
    public void calculateDeliveryTime(){
        float deliveryTime = 2;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert the order distance (In km) = ");
        orderDistance = userInput.nextFloat();
        totalDeliveryTime = deliveryTime * orderDistance;
        System.out.println("Estimated delivery time = " + totalDeliveryTime + " minutes.");
    }
}
