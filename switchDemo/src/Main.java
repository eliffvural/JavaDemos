public class Main {
    public static void main(String[] args) {
       char numberPlate= 45;

       switch(numberPlate){
           case 45:
               System.out.println("Manisa");
               break;

           case 34:
               System.out.println("İstanbul");
               break;

           case 21:
               System.out.println("Diyarbakir");
               break;

           case 78:
               System.out.println("Karabuk");
               break;

           default:
               System.out.println("Invalid plate.");

       }
    }
}