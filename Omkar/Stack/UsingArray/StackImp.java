public class StackImp {
    static int arr[];
    static int size;
    static int top=-1;
    
    StackImp(int n){
        arr = new int[n];
        size = n;
    }

    public static boolean isEmpty(){
        return top == -1;
    }

    public static boolean isFull(){
        return top == size-1;
    }

    public static void push(int data){
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top]=data;
    }

    public static int pop(){
        if (isEmpty()) {
            System.out.println("Stack Overflow");
            return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }

    public static int peek(){
        if (isEmpty()) {
            System.out.println("Stack Overflow");
            return -1;
        }
        return arr[top];
    }

    public static void display(){
        for(int i =top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }


}
