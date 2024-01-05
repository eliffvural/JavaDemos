public class Main {
    public static void main(String[] args) {

        String message="Today weather is so good.";
        String newMessage=message.substring(2,8);
        System.out.println(newMessage);
        int toplam=topla(5,6);
        System.out.println(toplam);
        String sehir=sehirVer();
        System.out.println(sehir);
        int toplam2=topla2(1,2,3,4,5);
        System.out.println(toplam2);



    }

    //methodlari kendimizi tekrar etmemek için kullaniyoruz.

    public static void add(){
        System.out.println("Added");

    }

    public static void delete(){
        System.out.println("Deleted");

    }

    public static void update(){
        System.out.println("Updated.");

    }

    public static int topla(int sayi1, int sayi2){

        return sayi1+sayi2;
    }

    public static int topla2(int... sayi){

        int toplam2=0;
        for(int sayilar:sayi){
            toplam2+=sayilar;

        }
        return toplam2;
    }

    public static String sehirVer(){

        return "Manisa";
    }



}