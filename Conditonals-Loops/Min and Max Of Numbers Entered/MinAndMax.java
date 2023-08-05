import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int count = 0;

        while(true){
            System.out.println("Enter a number or any character to exit : ");
            String nextEntry = sc.nextLine();
            try{
                int validNum = Integer.parseInt(nextEntry);
                if (count == 0 || validNum < min){
                    min = validNum;
                }
                if (count == 0 || validNum > max){
                    max = validNum;
                }
                count++;
            } catch (NumberFormatException nfe){
                break;
            }
        }
        sc.close();

        if(count > 0){
            System.out.println("Min = "+min+", Max = "+max);
        } else {
            System.out.println("No valid Input is entered");
        }
    }
    
}
