import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        

        if(num <= 1){
            System.out.println("Not a Prime Number");
        }
        else {
            for (int i = 2; i<= num/2; i++){
                if ((num % i) == 0){
                    System.out.println("It not a prime number.");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println(num+" is a prime number.");
            }
    
    sc.close();
}   
}
