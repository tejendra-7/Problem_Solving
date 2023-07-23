import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (to check if it is even or odd) : ");
        int num = sc.nextInt();

        if(num%2 == 0){                                         // this is condition for even
            System.out.println(num+" is an even number.");
        }else{                                                  // condition for odd is ( num%2 != 0 ) 
            System.out.println(num+" is an odd number");
        }

        sc.close();
    }
}
