package Lecture03;
import java.util.Scanner;
public class Problems {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to check prime: ");
        int n= sc.nextInt();
        // for(int i=1;i<=n;i++)
        //     System.out.println();
        //Find if N is prime or not

        boolean b=true; //Number is prime or not

        for(int i=2; i<n;i++){
            if(n%i==0){
                b=false;
                break;
            }
                
        }
        if(b==true){
            System.out.println("prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
