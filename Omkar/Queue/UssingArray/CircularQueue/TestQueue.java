public class TestQueue{
    public static void main(String[] args){

        CircularQueue q = new CircularQueue(5);

        q.addElem(1);
        q.addElem(2);
        q.addElem(3);
        q.addElem(4);
        System.out.println(q.removeElem()+" element removed");
        q.addElem(5);
        // System.out.println(q.removeElem()+" element removed");
        q.addElem(6);
        // int peak=q.peekElem();
        // System.out.println("peak: "+peak);
        q.display();
    }
}