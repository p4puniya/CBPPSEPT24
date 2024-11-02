package Lecture10;
public class TC {
    public static void main(String[] args) {
        int N=100;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j+=i)
                System.out.println("HI");
        }
        //n2 5
        //nlogn 5 Correct
        //log n
        // n 1

        for(int i=1;i<=N;i++){
            for(int j=1;j<=i*i;j++){
                for(int k=1;k<=N/2;k++)
                    System.out.println("Hi");
            }
        }

        // N^2 logN : 2
        // N^2 * 2^N : 2
        // N^3 logN : 5
        // N^3 : 2
        // N^4 : 3

        for(int i=1;i<=N;i++)
            for(int j=1;j<=i;j++)
                System.out.println("Hi");

        //N^2
        //
    }
}
