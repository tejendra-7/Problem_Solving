import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of Elements in series : ");
        int num = sc.nextInt();

        int a = 0 , b = 1,next;

        if(num == 1){
            System.out.println("Fibonacci Series : "+a);
        }else {
            System.out.print("Fibonacci Series upto "+num+" elements : "+a+" "+b+" ");
        }
        

        for(int i = 2; i<num; i++){
            next = a+b;
            a = b;
            b = next;
            System.out.print(next+" ");
        }
        sc.close();
    }
}
