import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,12,20,24,28,31,34,38,44,50};
        System.out.println("The array is:- {10,12,20,24,28,31,34,38,44,50} ");
        int first=0,last=arr.length;
        System.out.println("Enter number to search: ");
        int search = sc.nextInt();
        int pos = binarySearch(first,last,search,arr);
        if(pos!=-1){
            System.out.println("Element found at location: "+(pos+1));
        }
        sc.close();
    }

    public static int binarySearch(int f, int l, int s, int[] arr){
        while(f<=l){
            int m=(f+l)/2;
            if(arr[m]==s){
                return m;
            }
            else if(s>arr[m]){
                f = m+1;
            }
            else{
                l = m-1;
            }
        }
        return -1;
    }
}
