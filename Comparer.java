// Compare integers using if statements, relational operators
// By Ekpenyong David
import java.util.Scanner;

public class Comparer {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the next number: ");
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.printf("%d == %d%n", num1, num2);
        }

        if (num1 != num2) {
            System.out.printf("%d != %d%n", num1, num2);
        }

        if (num1 >= num2) {
            System.out.printf("%d >= %d%n", num1, num2);
        }

        if (num1 <= num2) {
            System.out.printf("%d <= %d%n", num1, num2);
        }

        if (num1 < num2) {
            System.out.printf("%d < %d%n", num1, num2);
        }

        if (num1 > num2) {
            System.out.printf("%d > %d%n", num1, num2);
        }
    } // end method main
} // end class Comparer
