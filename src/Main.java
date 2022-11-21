import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("<-----------MENU-------------->\n" +
                    "Select options:\n" +
                    "1. Addition\n" +
                    "2. Subtraction\n"+
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "To exit press '0'"
            );
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Sum = " + (num1 + num2));
                    break;
            }
        }
    }
}