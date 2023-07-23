import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , sum;
        System.out.println("Enter the first number : ");
        a = sc.nextInt();
        System.out.println("Enter the second number : ");
        b = sc.nextInt();

        sum = a+b;
        System.out.println("The sum of the two numbers is : "+sum);

        sc.close();
    }
}
