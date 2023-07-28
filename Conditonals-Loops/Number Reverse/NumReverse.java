import java.util.Scanner;

public class NumReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int reverse = 0,digit,value = num;

        while(num > 0){
            digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }

        System.out.println("The reverse of the given Number "+value+" is :"+reverse);

        sc.close();
    }
}
