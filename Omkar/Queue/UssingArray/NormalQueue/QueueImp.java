public class QueueImp {
    static int arr[];
    static int size;
    static int rear = -1;

    QueueImp(int n){
        arr = new int[n];
        size = n;
    }

    public static boolean isEmpty(){
        return rear == -1;
    }

    public static boolean isFull(){
        return rear == size-1;
    }

    public static int removeElem(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        rear--;
        int front = arr[0];
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        return front;
    }

    public static int peekElem(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }

    public static void addElem(int data){
        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }
        rear++;
        arr[rear]=data; 
    }

    public static void display(){
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
