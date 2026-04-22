package TarnaryOperators;

//Q38. Write a Java program to check whether a year is a leap year or not.
//leap year is the year that divisible by 4 or 400
public class LeapYearOrNot {
    public static void main(String[] args) {
        int year = 2000;
        String isIt = year % 400 == 0
                ? "Leap Year"
                : year % 100 == 0
                ? "Not Leap Year"
                : year % 4 == 0
                ? "This Is Leap Year"
                : "Not A Leap Year";
        System.out.println(isIt);
    }
}