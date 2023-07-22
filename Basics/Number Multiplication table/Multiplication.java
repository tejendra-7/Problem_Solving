import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();   // Enter the number of which table you wanted to print

        for(int i = 1; i<=10; i++) {     // This will print the first 10 values of the table
            System.out.println(num+" x "+i+" = "+(num*i));
        }

        sc.close();
    }
}