package baseCourse.ExclusiveClasses;

import java.util.Scanner;

public class C03FlagShow {
    public static void main(String[] args){
        Scanner insertionCapture = new Scanner(System.in);

        String flags[] = new String[6];

        flags[0] = "Brazil";
        flags[1] = "United States";
        flags[2] = "Canada";
        flags[3] = "Tokyo";
        flags[4] = "China";
        flags[5] = "Russia";

        int flagStars[] = new int[6];

        flagStars[0] = 0;
        flagStars[1] = 0;
        flagStars[2] = 0;
        flagStars[3] = 0;
        flagStars[4] = 0;
        flagStars[5] = 0;

        // "For" loop - Model 01 (Common loop)
        System.out.println("===================");
        System.out.println("Flags demonstration (Common 'for' loop) = ");
        for(int loop = 0; loop < flags.length; loop++){
            System.out.println(flags[loop]);
        }

        // "For" loop - Model 02 ("forEach" loop)
        System.out.println("===================");
        System.out.println("Flags demonstration ('forEach' loop) = ");
        for(String flag: flags){
            System.out.println(flag);
        }

        System.out.println("===================");
        System.out.println("Flag stars analyzer");
        int counter = 1;
        for(int showRounds = 1; showRounds <= 6; showRounds++){
            System.out.println("Flag " + showRounds + "/6");
            System.out.println(flags[showRounds]);
            for(int innerLoop = 0; innerLoop<flags.length;innerLoop++){
                System.out.println("Now, insert the flag class related to the desired flag.");
                System.out.println("Attempt " + counter + "/6");
                counter++;
                System.out.println("Available options: ");
                System.out.println("A - Alpha // B - Bravo // C - Charlie");
                System.out.println("Your choice = ");
                String userChoice = insertionCapture.next();
                if(userChoice.equals("A")){
                    flagStars[innerLoop]+=1;
                }else if(userChoice.equals("B")){
                    flagStars[innerLoop]+=3;
                }else if(userChoice.equals("C")){
                    flagStars[innerLoop]+=5;
                }else{
                    System.out.println("Error! No points detected. Please, try again");
                }
            }
            counter = 1;
        }
        System.out.println("Final stars classification");
        for(int lap = 0; lap < flags.length; lap++){
            System.out.println("Flag = " + flags[lap] + ". Stars = " + flagStars[lap]);
        }
    }
}
