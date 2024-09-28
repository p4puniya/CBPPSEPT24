package Lecture06;

public class BubbleSort {
    public static void bubbleSort( int[] arr){
        for(int turn= 1;turn<arr.length;turn++){
            for( int i=0; i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                }
            }
        }
    }
    static void display(int[] arr){
        for(int i:arr) System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr= {2,4,5,7,3,1,9,6};
        bubbleSort(arr);
        display(arr);
    }
}
