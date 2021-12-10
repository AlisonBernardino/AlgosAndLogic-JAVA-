package baseCourse.classes.class01;

import java.util.Scanner;

public class l01IfStatement {
    public static void main(String[] args){
        Scanner scanSample = new Scanner(System.in);

        System.out.println("How many apples do you have?");
        int applesCounter = scanSample.nextInt();

        if(applesCounter >= 5){
            System.out.println("Congratz! You have an apple pack");
            System.out.println("Current apples quantity = " + applesCounter);
        }else{
            System.out.println("Good! You have " + applesCounter + " apples.");
        }
    }
}
