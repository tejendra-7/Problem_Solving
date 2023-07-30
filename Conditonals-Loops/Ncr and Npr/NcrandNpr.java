import java.util.Scanner;

public class NcrandNpr {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Enter the value of n: ");
                int n = scanner.nextInt();
        
                System.out.print("Enter the value of r: ");
                int r = scanner.nextInt();
        
                long nCrResult = nCr(n, r);
                long nPrResult = nPr(n, r);
        
                System.out.println("nCr (Combinations) = " + nCrResult);
                System.out.println("nPr (Permutations) = " + nPrResult);
        
                scanner.close();
            }
            
            // Function to calculate the factorial of a number
            private static long factorial(int num) {
                long result = 1;
                for (int i = 1; i <= num; i++) {
                    result *= i;
                }
                return result;
            }
        
            // Function to calculate nCr
            private static long nCr(int n, int r) {
                if (r > n) {
                    return 0;
                }
                return factorial(n) / (factorial(r) * factorial(n - r));
            }
        
            // Function to calculate nPr
            private static long nPr(int n, int r) {
                if (r > n) {
                    return 0;
                }
                return factorial(n) / factorial(n - r);
            }
        }
