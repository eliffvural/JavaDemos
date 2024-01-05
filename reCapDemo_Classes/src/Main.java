public class Main {
    public static void main(String[] args) {
        DostIslem dortIslem= new DostIslem();
        int toplam=dortIslem.Topla(5,6);
        System.out.println(toplam);

        int fark=dortIslem.Cikar(12,9);
        System.out.println(fark);

        int carpim=dortIslem.Carp(6,8);
        System.out.println(carpim);

        int bolum=dortIslem.Bol(18,9);
        System.out.println(bolum);



    }
}