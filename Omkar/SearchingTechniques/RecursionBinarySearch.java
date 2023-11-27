import java.util.Scanner;

public class RecursionBinarySearch {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        int arr[] = {10,12,20,24,28,31,34,38,44,50};
        System.out.println("The array is:- {10,12,20,24,28,31,34,38,44,50} ");
        System.out.println("Enter number to serach ");
        int search = sc.nextInt();
        int first = 0, last=arr.length;
        int pos = recursionBinarySearch(first,last,search,arr);
        if(pos!=-1){
            System.out.println("Number found at location:= "+(pos+1));
        }
        sc.close();
    }

    public static int recursionBinarySearch(int f, int l ,int s, int[] arr){
        while(f<=l){
            int m=(f+l)/2;
            if(arr[m]==s){
                return m;
            }
            else if(s>arr[m]){
                return recursionBinarySearch(m+1,l,s,arr);
            }
            else {
                return recursionBinarySearch(f,m-1,s,arr);
            }
        }
        return -1;
    }
}
