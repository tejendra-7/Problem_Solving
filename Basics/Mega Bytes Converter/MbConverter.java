import java.util.Scanner;

public class MbConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value in KB : ");
        int kb = sc.nextInt();
        printMegaBytesAndKiloBytes(kb);

        sc.close();
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes <0){
            System.out.println("Invalid Value");
        }
        else{
            int megaBytes = kiloBytes/1024;
            int remaining = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remaining +" KB");
        }
    }
}
