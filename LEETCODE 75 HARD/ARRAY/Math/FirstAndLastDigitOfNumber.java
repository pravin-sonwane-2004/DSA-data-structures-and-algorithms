package Math;

public class FirstAndLastDigitOfNumber {
    public static void main(String [] args) {
        int number = 123;
        int firstNumber = number/100;
        int lastNumber = number % 10;
        System.out.println("First = "+ firstNumber + " , "+"Last = " + lastNumber );

    }
}
