import java.util.Scanner;

public class MarksToGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks out of 100 : ");
        int marks = sc.nextInt();

        if(marks <= 100 && marks >=90){
            System.out.println("You are in the toppers list");
            System.out.println("You got A+ Grade.");
        }else if(marks<90 && marks>=80){
            System.out.println("You are in Excellent Students list");
            System.out.println("You got A Grade.");
        }else if(marks < 80 && marks>=75){
            System.out.println("Your are in Good Students list.");
            System.out.println("You got B Grade.");
        }else if(marks<75 && marks>=55) {
            System.out.println("You are in Average Students list.");
            System.out.println("You got C Grade.");
        }else if(marks< 55 && marks>= 35){
            System.out.println("You are in Just Pass List.");
            System.out.println("You got D Grade.");
        }else if(marks<35 && marks >= 0){
            System.out.println("You are in Failed list");
            System.out.println("You got F Grade.");
        }else {
            System.out.println("Enter you marks between a Range of 1-100.");
        }

        sc.close();
    }
}
