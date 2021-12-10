package baseCourse.exercises.module03;

// "Window" class
public abstract class l04AbstractClassesWithMethods {
    // Class attribute
    private String windowModel;
    private String windowColor;

    // Default constructor
    public l04AbstractClassesWithMethods(){
    }

    // Specific constructor - 02 parameters
    public l04AbstractClassesWithMethods(String objectModel, String objectColor){
        this.windowModel = objectModel;
        this.windowColor = objectColor;
    }

    // Abstract method 01
    public abstract float calculateFinalWeight();

    // Abstract method 02
    public abstract boolean isWindowReadyForSale();
}
