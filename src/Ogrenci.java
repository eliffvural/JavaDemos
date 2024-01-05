public class Ogrenci {

    int ogrNo;
    String isim;
    static String fakulteAdi="Muhendislik";

    public static void degistir(){
        fakulteAdi="Muhendislik2";
    }

    public Ogrenci(int ogrNo, String isim){
        this.isim=isim;
        this.ogrNo=ogrNo;
    }

    public void bilgileriGoster(){
        System.out.println("Ogrenci no: "+ogrNo+""+"Ogrenci isim: "+isim+""+"Fakulte adi: "+fakulteAdi);
    }
}
