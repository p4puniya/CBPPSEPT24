package Lecture05;

public class Lec_Arrays {
    
    // int[] arr;

    static boolean armStrong(int n){
        int len=0;
        int temp=n;
        while(temp!=0){
            temp/=10;
            len++;
        }
        int sum=0;
        temp=n;
        while(temp!=0){
            sum+= (int)Math.pow(temp%10, len);
            temp/=10;
        }
        return (sum==n);
    }
    public static void main(String[] args) {
        // System.out.println(armStrong(2323));
        // int[] arr= new int[5];
        // arr[1]= 10;
        // arr[3]= 30;
        // arr[4]= 40;
        // arr[0]= 70;
        // arr[2]= 45;
        int[] arr;
        arr= new int[5];
        int[] nums= {1,2,3};
        arr[0]=1;
        
        // System.out.println(arr);
        // System.out.println(nums);
        arr=nums;
        arr[2]=6;
        System.out.println(nums[2]);
        // System.out.println(nums);
        // char[] s= new char[10];
        // s[0]='a';
        // s[1]= 'n';
        // // s[2]= ' ';
        // s[3]= 'k';
        // System.out.println(arr);
        //  System.out.print(arr.length);
    }
}
