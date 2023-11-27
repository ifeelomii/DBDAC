public class TestStack{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        StackImp s = new StackImp(10);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.push(5);
        s.push(6 );
        s.push(7);
        s.pop();
        s.push(8);

        s.display();

        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }

        
    }
}