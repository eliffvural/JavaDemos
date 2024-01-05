public class Main {
    public static void main(String[] args) {

        //stringler karakter dizileridir.

        String hijj="  Everything will be fine.  ";

        System.out.println(hijj);
       /* System.out.println("Number of character: "+hijj.length());

        //istenilen karakteri gösterir.
        System.out.println("10. character: "+ hijj.charAt(9));

        //concat birleştirir.
        System.out.println(hijj.concat("We will do that."));

        //starsWith ve endsWith boolean deger dondurur.
        System.out.println(hijj.startsWith("E"));
        System.out.println(hijj.startsWith("C"));
        System.out.println(hijj.endsWith("H"));
        System.out.println(hijj.endsWith("."));

        //getChars void bir operasyon yani herhangi bir deger dondurmuyor.
        char[] characters= new char[5];
        hijj.getChars(0, 4,characters, 0 );
        System.out.println(characters);

        //indexOf belirtilen karakterin mesajin içinde kacinci eleman oldugunu bulmaya yarar.
        //indexOf en soldan baslar ve buldugu ilk indexten sonucu verir.
        System.out.println(hijj.indexOf('k'));
        System.out.println(hijj.indexOf("v"));

        //lastIndexOf ise belirtilen karakteri mesajin sonundan saymaya baslar. Ve buldugu ilk indexten sonucu verir.
        System.out.println(hijj.lastIndexOf("h"));*/

        //replace ile istedigimiz karakterlerin yerini istedigimiz baska bir karakter ile degistirebiliriz.
        System.out.println(hijj.replace(' ', '-'));

        String hijj2= hijj.replace(' ', '-');
        System.out.println(hijj2);

        //substring metnin icinden parca almak icin kullanilir.
        System.out.println(hijj.substring(2));
        System.out.println(hijj.substring(2,5));

        //split methodu metni belli bir karakter dizisini dikkate alarak parcalamaya yarar.

        for( String word: hijj.split(" ")){
            System.out.println(word);

        }

        //toLowercase, tum buyuk harfleri kucuk yazacaktir.
        System.out.println(hijj.toLowerCase());

        //toUpperCase, tum kucuk harfleri buyuk yazacaktir.
        System.out.println(hijj.toUpperCase());

        //trim bastaki ve sondaki olan bosluklari kaldirir.
        System.out.println(hijj.trim());



    }
}