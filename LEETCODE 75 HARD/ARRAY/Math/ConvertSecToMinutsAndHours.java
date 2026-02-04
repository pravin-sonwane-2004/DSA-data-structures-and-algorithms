package Math;
/*
Q17. Write a Java program to convert seconds to hours, minutes and seconds.
*/
public class ConvertSecToMinutsAndHours {
    public static void main(String[] args) {
        int sec = 7300;
        int hrs = sec/3600;
        int remaining = sec % 3600;
        int minuts = remaining / 60;
        sec = remaining % 60;
        System.out.println("hrs : "+ hrs + " Min : "+ minuts +" Sec : " + sec);
    }
}
