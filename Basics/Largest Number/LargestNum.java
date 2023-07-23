import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 different numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("First number "+a+" is largest number");
        }else if(b>a && b>c) {
            System.out.println("Second number "+b+" is largest number");
        }else if (c>a && c>b){
            System.out.println("Third number "+c+" is largest number");
        }else if(a == b && a == c){
            System.out.println("All three numbers are equal");
        }
        else{
            System.out.println("Entere three different numbers may be entered same number multiple times.");
        }

        sc.close();
    }
}
