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
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=3;
        
        for(int i=0;i<k;i++)
            shiftByOne(arr);
        display(arr);
    }
}
