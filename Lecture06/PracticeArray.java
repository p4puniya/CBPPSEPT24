package Lecture06;

public class PracticeArray {

    static void display(int[] arr){
        // for(int i=0;i<arr.length;i++)
        //     System.out.print(arr[i]+" ");
        for(int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    static void reverse1(int[] arr){
        int[] nums= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[nums.length-1-i]= arr[i];
        }
        // arr= nums;// Shallow Copy

        //deep copy
        for(int i=0;i<arr.length;i++)
            arr[i]= nums[i];
    }
    
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        int[] nums= {1,2,3};
        // arr=nums;
        // System.out.println(arr);
        // swap(arr, 0, 4);

        // reverse1(arr1);
        // display(arr1);
    }
}
