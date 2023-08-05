import java.util.Scanner;

public class EvenDigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int digit,sum = 0,value = num;

        while(num > 0){
            digit = num%10;
            if(digit%2 == 0){ // this is the condition find even digits (change the condition as != for odd numbers sum)
                sum += digit; // adding all even digits into sum
            }
            num /= 10;
        }

        System.out.println("The sum of Even digit in "+value+" : "+sum);
        sc.close();
    }
}
