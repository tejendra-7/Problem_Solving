import java.util.Scanner;

public class NumInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int digit,rev = 0;
        System.out.println("The number "+num+" In words is : ");

        // Here first we are reversing the number because we need to print the words in correct order
        // as here first the last number will be extracted as the digit it will be printed as the first word 
        // But we wanted the first num as the first word so we reverse the number
        while(num > 0){
            digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }


        while(rev > 0){
            digit = rev%10;

            // This is switch statement to print the word according to the number 
            switch (digit){
                case 0:
                    System.out.print("ZERO ");
                    break;
                case 1:
                    System.out.print("ONE ");
                    break;
                case 2:
                    System.out.print("TWO ");
                    break;
                case 3:
                    System.out.print("THREE ");
                    break;
                case 4:
                    System.out.print("FOUR ");
                    break;
                case 5:
                    System.out.print("FIVE ");
                    break;
                case 6:
                    System.out.print("SIX ");
                    break;
                case 7:
                    System.out.print("SEVEN ");
                    break;
                case 8:
                    System.out.print("EIGHT ");
                    break;
                case 9:
                    System.out.print("NINE ");
                    break;
                default:
                    System.out.print("OTHER ");
            }
            rev = rev/10;
        }

        
        sc.close();
    }
}
