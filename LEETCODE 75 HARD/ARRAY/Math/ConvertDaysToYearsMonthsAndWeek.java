package Math;
/*
Q18. Write a Java program to convert days to years, month and week.
 */
public class ConvertDaysToYearsMonthsAndWeek {
    public static void main(String[] args) {
        int days = 366;
        int year = days/365;
        int remaining = year % 365;
        int months = remaining/30;
        remaining = remaining%30;
        int weeks = remaining /7;
        days = remaining % 7;

    }
}
