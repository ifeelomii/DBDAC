package SortingTechniques;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n =arr.length;

        for(int i=0; i<n-1; i++){
            int minIndx = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[minIndx]){
                    minIndx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
        }
    }

}
