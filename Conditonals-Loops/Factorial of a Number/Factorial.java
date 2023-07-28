import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int fact=1,value = num;

        while(num>1){
            fact *= num;
            num--;
        }

        System.out.println("The factorial of "+value+" is : "+fact);

        sc.close();
    }
}
