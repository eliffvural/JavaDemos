public class Main {
    public static void main(String[] args) {

        //which number is the biggest?

        int number1=19;
        int number2=21;
        int number3=3;

        int biggestNumber=number1;

        if(biggestNumber<number2){
            biggestNumber=number2;
        }
        if (biggestNumber<number3) {
            biggestNumber=number3;
        }

        System.out.println("The biggest number is: "+biggestNumber);



    }
}