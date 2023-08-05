import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Speed in KMPH : ");
        double speed = sc.nextDouble();

        long value = toMilesPerHour(speed);
        System.out.println("The value of "+speed+" in MPH is : "+value);

        printConversion(speed);
        sc.close();
    }
    
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0 ){
            return -1;
        }else{
            kilometersPerHour /= 1.609;
            long rounded = Math.round(kilometersPerHour);
            return rounded;
        }
    }
    
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            double milesPerHour = Math.round(kilometersPerHour/1.609);
            System.out.println(kilometersPerHour+" km/h = "+(int)milesPerHour+" mi/h");
        }
    }
}