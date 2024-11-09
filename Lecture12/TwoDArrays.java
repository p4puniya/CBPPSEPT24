package Lecture12;

import java.util.Arrays;

public class TwoDArrays {
    static void populate(int[][] nums){
        int n=10;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=n;
                n++;
            }
        }
    }
    //Display
    static void display(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    //Sort 2D Array: By Rows, By Cols, Whole 2D Array
    //Rows
    static void sortByRows(int[][] nums){
        for(int i=0;i<nums.length;i++)
            Arrays.sort(nums[i]);
    }

    //Cols
    static void sortByCols(int[][] nums){
        Arrays.sort(nums, (a,b)->Integer.compare(a[0], b[0]));
    }


    static void transpose(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums[0].length;j++){
                int temp= nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]= temp;
            }
        }
    }
    static void fillArray(int[][] nums, int[] arr){
        int rows= nums.length;
        int cols= nums[0].length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=arr[cols*i + j];
            }
        }
    }

    //Whole Matrix
    static void sortComplete(int[][] nums){
        int[] arr= flaten(nums);
        Arrays.sort(arr);
        fillArray(nums, arr);
    }
    
    static int[] flaten(int[][] nums){
        int rows= nums.length;
        int cols= nums[0].length;
        int[] arr= new int[rows * cols];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                arr[cols*i + j]= nums[i][j];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int n= 5;
        // int[] num= new int[4];
        int[][] arr= {
            {11,2,3,4},
            {4,2,56,7},
            {14,2,56,7},    
            {9,12,6,97},
            {12,92,5,1}
        };
        // int[] nums= flaten(arr);
        // for(int i:nums)
        //     System.out.print(i+" ");
        

        // populate(arr);
        display(arr);
        sortComplete(arr);
        display(arr);
        // sortByCols(arr);
        // System.out.println();
        // display(arr);

        // int[][][] arr1= new int[2][4][2];
        // int[][][][] arr2= new int[3][4][2][5];
        // arr[0][0]=10;
        // System.out.println(arr[0][0]);
    }
}
