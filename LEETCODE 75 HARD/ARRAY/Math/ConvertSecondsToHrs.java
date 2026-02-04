package Math;
/*
        Q17. Write a Java program to convert seconds to hours, minutes and seconds.
 */

public class ConvertSecondsToHrs {
    public static void main(String[] args) {
        int sec = 7200;

        int hours = sec / 3600;
        int remaining = sec % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
