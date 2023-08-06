import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        int sum = 0;

        if(num <= 0){

        }
        for(int i = 1; i<num; i++){
            if(num%i==0){
                sum += i;
            }
        }

        if(sum == num){
            System.out.println("The Given number "+num+" is a perfect Number.");
        }else {
            System.out.println("The given number is not a perfect Number.");
        }
        sc.close();
    }    
}
