package Lecture04;

public class PatternPrinting {
    //
    static void printSquare(int n){
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void printRFT(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i && j<=n-2;j++)
                System.out.print(j+ " ");
            System.out.println();
        }
    }

    static void printLFT(int n){
        for(int i=1;i<=n;i++){
            //for printing spaces
            for(int k=1; k<=(n-i);k++)
                System.out.print("  ");
            //For printing stars
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void printILFT(int n){
        for(int i=n;i>=1;i--){
            //for printing spaces
            for(int k=1; k<=2*(n-i);k++)
                System.out.print("  ");
            //For printing stars
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void printHollowSquare(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        // printSquare(n);
        // printILFT(n);
        printHollowSquare(n);
    }
}
