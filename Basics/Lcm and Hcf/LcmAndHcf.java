import java.util.Scanner;

public class LcmAndHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter value of num1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter value of num2 : ");
        num2 = sc.nextInt();

        sc.close();
        
        int hcf = 0;

        for (int i = 1; i<=num1; i++){
            if(num1%i==0 && num2%i == 0){
                // System.out.println(i);     //This will print all the factors of the number
                hcf = i;                      // but this will give the largest factor after iterating over the loop
            }
        }

        System.out.println("HCF = "+hcf);

        int lcm = (num1>num2) ? num1 : num2;
        while(true) {
            if(lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("Lcm of numbers entered is : "+lcm);
                break;
            }
            ++lcm;
        }        
    }
}
