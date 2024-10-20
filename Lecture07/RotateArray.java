package Lecture07;

public class RotateArray {
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }

    static void shiftByOne(int[] arr){
        int key = arr[arr.length-1];
        for(int i= arr.length-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]= key;            
    }

    public static void rotateUsingIndex(int[] arr, int k) {
        int[] temp=new int[arr.length];
        int n=arr.length;
        k=k%n;
        for(int i=0;i<n-k;i++){
            temp[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            temp[i]=arr[n-k+i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }

     // reverse
   static void reverse(int[] nums, int i,int j){
    while(i<j){
        int temp=nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
        i++;j--;
    }
}
public static void rotate(int[] nums, int k) {
    // reverse(nums,2,4);
    k%=nums.length;
    reverse(nums, 0, nums.length-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, nums.length-1);
}

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=3;
        
        for(int i=0;i<k;i++)
            shiftByOne(arr);
        display(arr);
    }
}
