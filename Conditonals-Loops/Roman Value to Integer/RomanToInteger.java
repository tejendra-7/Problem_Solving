import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rule is that your Roman Numberal Can contain only these Characters \n('I', 'V', 'X', 'L', 'C', 'D', 'M')");
        System.out.println("Enter a Roman Numberal : ");

        String romanValue = sc.nextLine();

        int value = romanToInt(romanValue);
        System.out.println("The Integer value of "+romanValue+" : "+value);

        sc.close();
    }

    static int romanToInt(String str) {
        int num = 0 , prev = 0, ans=0;
        int len = str.length();

        for(int i = len-1; i>=0; i--){
                switch(str.charAt(i)){
                    case 'I':
                        num = 1;
                        break;
                    case 'V':
                        num = 5;
                        break;
                    case 'X':
                        num = 10;
                        break;
                    case 'L':
                        num = 50;
                        break;
                    case 'C':
                        num = 100;
                        break;
                    case 'D':
                        num = 500;
                        break;
                    case 'M':
                        num = 1000;
                        break; 
            }

            if(num > prev){
                ans += num;
            }else{
                ans -= num;
            }

            prev = num;
        }

        return ans;
    }
}
