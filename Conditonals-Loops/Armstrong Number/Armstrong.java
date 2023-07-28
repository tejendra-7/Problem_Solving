import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three digit Number : ");
        int num = sc.nextInt();

        int digit = 0, sum = 0,value = num;

        while(num > 0){
            digit = num%10;             // seperating each digit from the given number 
            sum += (digit*digit*digit); // Multiplying and adding the values into sum variable
            num = num/10;
        }

        if(sum == value ){
            System.out.println("Number "+value+" is an Armstrong Number.");
        }else{
            System.out.println("Given Number is not an Armstrong Number.");
        }


        sc.close();
    }
}
