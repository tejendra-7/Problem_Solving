import java.util.Scanner;

public class IfElseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the an operator (+ , - , / , *) : ");
        char operator = sc.next().charAt(0); // This is how we take input of the character in java using the scanner method

        if(operator == '+'){
            System.out.println("The Sum of "+num1+" "+operator+" "+num2+" : "+(num1+num2));
        }else if(operator == '-'){
            System.out.println("The Subtraction of "+num1+" "+operator+" "+num2+" : "+(num1-num2));
        }else if(operator == '*'){
            System.out.println("The Multiplication of "+num1+" "+operator+" "+num2+" : "+(num1*num2));
        }else if(operator == '/'){
            System.out.println("The Division of "+num1+" "+operator+" "+num2+" : "+(num1/num2));
        }else if(operator == '%'){
            System.out.println("The Division of "+num1+" "+operator+" "+num2+" : "+(num1%num2));
        }
        else{
            System.out.println("Enter operator from the following : + , - , / , * ");
        }        

        sc.close();
        
    }
}
