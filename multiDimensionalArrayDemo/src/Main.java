// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[][] cities= new String[3][3];

        cities[0][0]= "Manisa";
        cities[0][1]= "Istanbul";
        cities[0][2]= "Diyarbakir";
        cities[1][0]= "Karabuk";
        cities[1][1]= "Izmir";
        cities[1][2]= "Antalya";
        cities[2][0]= "Mugla";
        cities[2][1]= "Zonguldak";
        cities[2][2]= "Kastamonu";

        for (int i = 0; i < cities.length; i++) {
            System.out.println("-----------------");
            for (int j = 0; j < cities.length; j++) {
                System.out.println(cities[i][j]);

            }

        }

    }
}