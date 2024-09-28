package Lecture06;

import java.util.Arrays;
public class InsertionSort {
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    //insertion sort
    static void insertionSort(int arr[]){
        // int n= arr.length;
        //
        for(int i=1;i<arr.length;i++){
            int key= arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                --j;
            }
            arr[j+1]= key;
        }
    }
    
    public static void main(String[] args) {
        int[] arr= {1,6,9,8,7,2,3,5,4};
        // insertionSort(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 10));
        display(arr);
    }
}
