public class Main {
    public static void main(String[] args) {

        Ogrenci.degistir();
        Ogrenci ogrenci1= new Ogrenci(111,"Emre" );
        Ogrenci ogrenci2= new Ogrenci(222, "Elif");
        ogrenci1.bilgileriGoster();
        ogrenci2.bilgileriGoster();
    }
}