import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P,T,R;
        System.out.println("Enter the Pricipal Amount : ");
        P = sc.nextInt();
        System.out.println("Enter the Time period in Years : ");
        T = sc.nextInt();
        System.out.println("Enter the Rate of Interest per Annum : ");
        R = sc.nextInt();

        int SI = (P*T*R)/100;
        System.out.println("Simple Interest : "+ SI);
        
        sc.close();

    }
    
}
