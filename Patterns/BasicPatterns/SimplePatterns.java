public class SimplePatterns {
    public static void main(String[] args) {
        System.out.println("\nRight angle triangle patter\n");
        p1(5);
        System.out.println("\nSquare pattern rows == cols\n");
        p2(10);
        System.out.println("\nRight angle triangle with 1-n numbers\n");
        p3(5);
        System.out.println("\nArrow pattern using stars\n");
        p4(5);
        System.out.println("\nReverse right angle triangle pattern\n");
        p5(5);

    }

    static void p1(int n){
        // right angle triangle pattern
        for(int rows = 1; rows<n; rows++){
            for(int cols = 1; cols<=rows; cols++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void p2(int n){
        // square pattern equal no of rows and cols
        for(int row = 1; row <n; row++){
            for(int col = 1; col<= n; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void p3(int n){
        // right angle triangle with 1-col numbers 
        for(int row = 1; row<n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }

    static void p4(int n){
        // arrow pattern here no of rows = 2n-1
        for(int row = 1; row<=2*n; row++){
            if(row<n){
                for(int col = 1; col<= row; col++){
                    System.out.print("*");
                }   
            }else{
                for(int col = 1; col<=2*n-row+1; col++){
                    System.out.print("*");
                    
                }
            }
            System.out.println("");
            
        }
    }

    static void p5(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<= n-row+1; col++){
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }
}
