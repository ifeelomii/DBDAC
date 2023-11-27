
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int si, int ei) {
        int mi = (si+ei)/2;
        if(si<ei){
            mergeSort(arr, si, mi);
            mergeSort(arr, mi+1, ei);
            merge(arr, si, ei, mi);
        }
    }

    public static void merge(int[] arr, int si, int ei, int mi){
        int[] mergedArray = new int[si+ei-1];
        int i=0,j=0,k=0;
        int n1 = mi-si+1; //length if left array
        int n2 = ei-mi; //length of right array

        //generating new Arrays
        int[] lArray= new int[n1];
        int[] rArray= new int[n2];

        // copying left array
        for(i=0;i<n1;i++){
            lArray[k]=arr[si+i];
        }
        // copying right array
        for(i=0;i<n1;i++){
            rArray[k]=arr[mi+1+i];
        }

        //copying both array into one in sorted fashion
        while (i<n1 && j<n2) {
            if(lArray[i]<rArray[j]){
                mergedArray[k]=lArray[i];
                i++;
                k++;
            }else{
                mergedArray[k]=rArray[j];
                j++;
                k++;
            }
        }

        //copying remaining items from left array if length of left array is greater than right array
        while (i<n1) {
            mergedArray[k]=lArray[i];
            i++;
            k++;
        }
        
        //copying remaining items from right array if length of right array is greater than left array
        while (j<n2) {
            mergedArray[k]=lArray[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
