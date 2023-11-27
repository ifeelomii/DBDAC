public class CircularQueue {
    static int arr[];
    static int size;
    static int front=-1;
    static int rear=-1;

    CircularQueue(int n){
        arr = new int[n];
        size = n;
    }

    public static boolean isEmpty(){
        return rear == -1 && front==-1;
    }

    public static boolean isFull(){
        return front == (rear+1)%size ;
    }

    public static int removeElem(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        //Single element 
        // if(rear == front){
        //     rear = front =-1;
        // }
            
        int result = arr[front];
        front = (front+1)%size;
        return result;
    }

    public static void addElem(int data){
        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }

        if (front==-1) {
            front=0;
        }
        rear =(rear+1)%size;
        arr[rear]=data;
    }

    public static int peekElem(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    public static void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
