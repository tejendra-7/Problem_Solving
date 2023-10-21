public class SimplePatterns {
    public static void main(String[] args) {
        System.out.println("\nRight angle triangle patter\n");
        p1(5);
        System.out.println("\nSquare pattern rows == cols\n");
        p2(10);
    }

    static void p1(int n){
        // right angle triangle pattern
        for(int rows = 1; rows<n; rows++){
            for(int cols = 1; cols<=rows; cols++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void p2(int n){
        // square pattern equal no of rows and cols
        for(int row = 1; row <n; row++){
            for(int col = 1; col<= n; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
