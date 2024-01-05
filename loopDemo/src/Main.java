public class Main {
    public static void main(String[] args) {

        //for

        for (int i=0; i<19; i++){
            System.out.println(i);
        }
        System.out.println("ForLoop finished.");

        //While
        int i=1;
        while (i<19){
            System.out.println(i);
            i+=2;
        }
        System.out.println("WhileLoop finished.");

        //Do-While
        int j=2;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Loop finished.");
    }
}