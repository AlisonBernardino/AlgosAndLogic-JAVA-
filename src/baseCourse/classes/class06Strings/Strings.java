package baseCourse.classes.class06Strings;

public class Strings {
    public static void main(String[] args){
        // Characters

        // === Working with characters (String fractions) ===
        // isDigit = Checks if the typed input is a digit
        System.out.println(" ");
        System.out.println("=========================");
        System.out.println("Character checker");
        System.out.println("==== Digits analyzer ====");
        System.out.println("Is G a digit?");
        System.out.println("Answer = " + Character.isDigit('G'));
        System.out.println("Is 0 (Zero) a digit?");
        System.out.println("Answer = " + Character.isDigit('0'));

        // isLetter = Checks if the typed input is a letter
        System.out.println(" ");
        System.out.println("==== Letters analyzer ====");
        System.out.println("Is H a letter?");
        System.out.println("Answer = " + Character.isLetter('H'));
        System.out.println("Is ! a letter?");
        System.out.println("Answer = " + Character.isLetter('!'));

        // isLetterOrDigit = Checks if the inserted data is a letter or a digit
        System.out.println(" ");
        System.out.println("==== Letter or digit checker ====");
        System.out.println("Is 3 a digit or a letter?");
        System.out.println("Answer = " + Character.isLetterOrDigit('A'));
        System.out.println("Is X a digit a letter or a digit?");
        System.out.println("Answer = " + Character.isLetterOrDigit('5'));

        // isUpperCase = Checks if the typed input is uppercase
        System.out.println(" ");
        System.out.println("==== Uppercase checker ====");
        System.out.println("Is the R letter capitalized?");
        System.out.println("Answer = " + Character.isUpperCase('R'));
        System.out.println("Is the z letter capitalized?");
        System.out.println("Answer = " + Character.isUpperCase('z'));

        // isLowerCase = Analyzes if the inserted input is lowercase
        System.out.println(" ");
        System.out.println("==== Lowercase checker ====");
        System.out.println("Is the e letter in lowercase?");
        System.out.println("Answer = " + Character.isLowerCase('e'));
        System.out.println("Is the J letter in lowercase?");
        System.out.println("Answer = " + Character.isLowerCase('J'));

        // isWhitespace = White spaces checker
        System.out.println(" ");
        System.out.println("==== White spaces checker ====");
        System.out.println("Is there any white spaces? (Checkout 01 = ' ')");
        System.out.println("Answer = " + Character.isWhitespace(' '));
        System.out.println("Is there any white spaces? (Checkout 02) = '.')");
        System.out.println("Answer = " + Character.isWhitespace('.'));

        // === Working with strings ===
        String specificFile = "anIndex.html";

        // To replace the file format using Java methods
        System.out.println(" ");
        System.out.println("==== File format replacer ====");
        System.out.println("Change from HTML to JS");
        System.out.println("File name BEFORE changes = ");
        System.out.println(specificFile);
        specificFile = specificFile.replaceAll("html","js");
        System.out.println("File name AFTER changes = ");
        System.out.println(specificFile);

        System.out.println(" ");
        System.out.println("==============");
        System.out.println("Testing and comparing the variables contents");
        String variableA = "TestingABC";
        String variableB = "Testing1234";

        // To test the content equality
        System.out.println("Are the variables carrying the same content? ");
        System.out.println("Answer = " + variableA.equals(variableB));

        // To check content equality ignoring cases (Uppercase)
        System.out.println("Are the variables storing the same value (Ignoring cases)?");
        System.out.println("Answer = " + variableA.equalsIgnoreCase(variableB));

        // To identify the variable content start
        System.out.println("Does the variable content starts with 'var'?");
        System.out.println("Answer = " + variableA.startsWith("Var"));

        // To check the variable content end
        System.out.println("Does the variable content ends with 'ABC'?");
        System.out.println("Answer = " + variableA.endsWith("ABC"));

        // To compare the variables content
        System.out.println("Is the variable content equal to 'variable'?");
        System.out.println("Answer = " + variableA.compareTo("variable"));

        // Discovering the variables length
        // VariableA
        int variableALength = variableA.length();
        System.out.println("VariableA length = ");
        System.out.println(variableALength);

        // VariableB
        int variableBLength = variableB.length();
        System.out.println("VariableB length = ");
        System.out.println(variableBLength);

        // Finding the variable content index
        char contentPosition = variableA.charAt(3);
        System.out.println("VariableA - Index [3] content = ");
        System.out.println(contentPosition);

        // Encountering the substring to grab more than one char
        System.out.println("Grabbing 07 characters from variableA");
        System.out.println("Substring method result = ");
        System.out.println(variableA.substring(0,7));

        // Searching for variable content index
        System.out.println("VariableB - 'i' char content index = ");
        System.out.println("Answer = " + variableB.indexOf("i"));

        // Finding the last variable content index
        System.out.println("VariableA - Last 'n' char content index = ");
        System.out.println("Answer = " + variableA.lastIndexOf("n"));
    }
}
