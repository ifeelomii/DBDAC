public class LinearSearch{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        int[] arr={12,45,85,65,47,26,42,95,16,48};
        int search = 95;
        boolean bool=false;
        for(int i = 0; i<10;i++){
            if (search==arr[i]) {
            bool = true;
            }
        }
        if (bool) {
            System.out.println("'Element Found'");
        }
        else{
            System.out.println("'Elemen Not Found'");
        }
    }
}