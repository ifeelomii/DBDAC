package SortingTechniques;

import java.util.Arrays;

public class TestMain {
     public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();


        int[] arr = {12, 34, 56, 43, 95, 42, 58, 25, 32, 79, 94, 64};
        int n = arr.length;
        System.out.println("Array Before Any Sorting is: " +Arrays.toString(arr));

        /* Sorting technqiues */

        BubbleSort.bubbleSort(arr);
        System.out.println("Array After Bubble Sorting is: " +Arrays.toString(arr));

        // SelectionSort.selectionSort(arr);
        // System.out.println("Array After Selection Sorting is: " +Arrays.toString(arr));

        //InsertionSort.insertionSort(arr);
        //System.out.println("Array After Insertion Sorting is: " +Arrays.toString(arr));

        // MergeSort.mergeSort(arr, 0, n-1);
        // System.out.println("Array After Merge Sorting is: " +Arrays.toString(arr));

    }
}
