package baseCourse.classes.class07ErrorTreatment;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorsView02 {
    public static void main(String[] args){
        try{
            new java.io.FileReader("errorDetails.txt");
        }catch(FileNotFoundException fileNotFound){
            fileNotFound.printStackTrace();
        }catch(IOException ioException){
            ioException.printStackTrace();
        }
    }
}
