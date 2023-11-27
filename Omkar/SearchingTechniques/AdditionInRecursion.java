import java.util.Scanner;
public class AdditionInRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to add");
        int n=sc.nextInt();
        int res = addRec(n);
        if(res!=0){
            System.out.println("Result is :"+res);
        }
        sc.close();
    }

    public static int addRec(int n){
        if(n>=1){
            return n+addRec(n-1);
        }
        return 0;
    }
}
