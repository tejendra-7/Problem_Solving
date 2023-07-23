import java.util.Scanner;

public class SumOfNumbersUntilStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter numbers (type 'x' to stop) :");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                sum += number;
            } else if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                System.out.println("You entered: " + number);
                sum += number;
            } else if (scanner.hasNextFloat()) {
                float number = scanner.nextFloat();
                System.out.println("You entered: " + number);
                sum += number;
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("x")) {
                    System.out.println("Exiting the program.");
                    break;
                }
                System.out.println("Non-numeric value entered: " + input);
            }
        }

        scanner.close();
        System.out.println("The sum of all the numbers : "+sum);
    }

}
