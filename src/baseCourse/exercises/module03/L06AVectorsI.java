package baseCourse.exercises.module03;

// To import the "Arrays" from the "Util" bookshelf
import java.util.Arrays;

public class L06AVectorsI {
    public static void main(String[] args) {
        // "String" type vector example
        String[] rainbowColors = new String[7];

        // Defining vector values
        rainbowColors[0] = "Violet";
        rainbowColors[1] = "Indigo";
        rainbowColors[2] = "Blue";
        rainbowColors[3] = "Green";
        rainbowColors[4] = "Yellow";
        rainbowColors[5] = "Orange";
        rainbowColors[6] = "Red";

        // To run the array printing the rainbow colors
        System.out.println("Rainbow colors = ");
        for(int counter = 0; counter<7; counter++){
            System.out.println(rainbowColors[counter]);
        }
    }
}
