package ToAddToAlgosAndLogic;

import java.util.Scanner;

public class C01LargerNumber {
    public static void main(String[] args){
        Scanner numberInput = new Scanner(System.in);
        float insertedNumber;
        float largestNumber;

        System.out.println("=====================");
        System.out.println("Largest number checker v2.0");
        System.out.println("Basic step = Insert the value 01 = ");
        insertedNumber = numberInput.nextFloat();
        System.out.println("Medium level = Now, type the value 02 = ");
        largestNumber = numberInput.nextFloat();

        if(insertedNumber > largestNumber){
            largestNumber = insertedNumber;
        }else{
            System.out.println("Hard level = To finish, insert the value 03 =");
            insertedNumber = numberInput.nextFloat();
            if(insertedNumber > largestNumber){
                largestNumber = insertedNumber;
            }else{
                System.out.println("The 3rd number isn't larger than the previous number");
            }
        }

        System.out.println("================================");
        System.out.println("Analysis completed successfully!");
        System.out.println("Largest number = " + largestNumber);
    }
}
