import java.util.Scanner;

public class AverageOfNums {
    public static void main(String[] args) {

        // This will give average of the numbers entered until number entered is 0 

        Scanner sc = new Scanner(System.in);

        int num = 1, sum = 0 , count = 0;

        while(num > 0){
            System.out.println("Enter a number or '0' to exit : ");
            num = sc.nextInt();
            if(num == 0) {
                break;
            }
            sum += num;
            count++;

        }

        int avg = sum/count;
        System.out.println("The average of the given numbers : "+avg);

        sc.close();
    }
}
