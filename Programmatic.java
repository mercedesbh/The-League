import java.util.Scanner; 
import java.text.DecimalFormat; 
import java.util.*;

public class Programmatic extends ProgrammaticSuper{
    public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.
        System.out.println("Hello, World");

        int number = 10;
        Scanner scanner = new Scanner(System.in);
        test(number);
        // tempConversion(scanner);
        uniqueCharacters(scanner);

        //Checks to see if an array is empty, if it is, it will fill it with items
        List <String> items = new ArrayList<>(); 

        returnList(items);
    }

    public static void test(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }

    // Java program to convert temperature from Fahrenheit to Celsius degree
    // Takes degrees in Fahrenheit and outputs as Celcius
    public static double tempConversion(Scanner scanner) {
        System.out.println("Input a degrees as Celcius: ");
        double temp = scanner.nextDouble();
        temp = (temp - 32) * .5556;
        temp = Double.parseDouble(new DecimalFormat("##.##").format(temp));
        System.out.println(temp);
        return temp;
    }

    //Java program to manipulate lists
    public static void returnList(List items) {
        if (items.size() == 0) {
            System.out.println("The list is empty!");
        }
    }

    //Java program to determine if a string has all unique characters.
    public static boolean uniqueCharacters(Scanner scanner) {
        boolean[] char_set = new boolean[256];
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        System.out.println(string);
        for (int i = 0; i < string.length(); i++ ) {
            int val = string.charAt(i);
            if (char_set[val]) {
                System.out.println("The string does not contain all unique characters");
                return false;
            } else {
            char_set[val] = true; 
            }
        }
        System.out.println("The string contains all unique characters");
        return true;
    }


}