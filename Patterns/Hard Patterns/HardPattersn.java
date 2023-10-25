public class HardPattersn {
    public static void main(String[] args) {
        System.out.println("\nDiamond pattern using *\n");
        p1(5);
        System.out.println("\nNumbers Pyramid pattern\n");
        p2(5);
        System.out.println("\nNumbers diamond pattern\n");
        p3(5);
        System.out.println("\nNumbers box pattern Ascending order\n");
        p4(4);
        System.out.println("\nNumbers box pattern Descending order\n");
        p5(4);
    }
    static void p1(int n){
        // diamond pattern
        for(int row = 0; row < 2*n; row++){
            int totalCols = row>n ? 2*n-row : row;
            int noOfSpaces = n - totalCols;

            for(int s = 0; s<noOfSpaces; s++){
                System.out.print(" ");
            }

            for(int col = 0; col < totalCols; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void p2(int n){
        // pyramid numbers pattern
        for(int row = 0; row<=n; row++){
            for(int spaces = 0; spaces <n-row; spaces++){
                System.out.print(" ");
            }
            for(int cols = row; cols>=1; cols--){
                System.out.print(cols);
            }
            for(int col = 2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println("");
        }
    }

    static void p3(int n){
        // diamond numbers pattern
        for(int row = 0; row<=2*n; row++){

            int r = row > n ? 2*n - row: row;

            for(int spaces = 0; spaces <n-r; spaces++){
                System.out.print(" ");
            }
            for(int col = r; col>=1; col--){
                System.out.print(col);
            }
            for(int col = 2; col<=r; col++){
                System.out.print(col);
            }
            System.out.println("");
        }
    }

    static void p4(int n){
        n = 2*n;
        for(int row = 0; row <= n; row++){
            for(int col = 0; col<= n; col++){
                int atEveryIndex = Math.min(Math.min(col,row),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println("");
        }
    }
    static void p5(int n){
        // numbers box pattern in descending order
        n = 2*n;
        for(int row = 0; row <= n; row++){
            for(int col = 0; col<= n; col++){
                int atEveryIndex = (n/2)-Math.min(Math.min(col,row),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println("");
        }
    }
}
