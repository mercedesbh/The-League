import java.util.Scanner; 
import java.text.DecimalFormat; 

public class Programmatic {
    public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.
        System.out.println("Hello, World");

        int number = 10;
        Scanner scanner = new Scanner(System.in);
        test(number);
        tempConversion(scanner);
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


}