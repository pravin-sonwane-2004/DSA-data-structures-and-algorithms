    package Math;
/*
        Q6. Write a java program to enter length in centimeter and convert into meter and kilometer.
*/

    import java.util.Scanner;

    public class ConvertCentemetersToKilometerandMeter {
        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter value");
                double cm = sc.nextDouble();
            double meters = cm / 100;
            double kelometers = cm / 100000;
            System.out.println(meters);
            System.out.println(kelometers);
        }
    }
