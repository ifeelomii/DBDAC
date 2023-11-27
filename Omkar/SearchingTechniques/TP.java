public class TP
{
    public static void main(String[] args)
    {
        int[] arr = {1, 21, 23, 24, 35, 39, 45, 82, 94};
        int f=0, l=arr.length, search=45;
        int pos = binarySearch(f,l,arr,search);
        if(pos!=-1){
            System.out.println("Number found at location: "+(pos+1));
        }
    }

    private static int binarySearch(int f, int l, int[] arr, int search) {
        while(f<l)
        {
            int mid=(f+l)/2;
            if(arr[mid]<l)
            {
                return binarySearch(mid+1, l, arr, search);
            }
            else if(arr[mid]>l)
            {
                return binarySearch(f, mid-1, arr, search);
            }
            else if (arr[mid]==search)
            {
                return mid;
            }
        }
        return -1;
    }
}