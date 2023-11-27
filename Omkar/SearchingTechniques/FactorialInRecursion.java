import java.util.Scanner;

public class FactorialInRecursion {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int res = recursionFac(n);
        if(res!=1){
            System.out.println("Result is: "+res);
        }
        sc.close();
    }
    public static int recursionFac(int n){
        if(n>1)
            return n*recursionFac(n-1);
        
        return 1;
    }
}
