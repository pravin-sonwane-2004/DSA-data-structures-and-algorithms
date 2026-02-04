package TarnaryOperators;
/*
Q53. Take percentage and income of a student:
If percentage >= 75 AND income < 200000, print "Eligible"


Else "Not Eligible"

 */
public class CheckIsElegible {
    public static void main (String [] args) {
        int percentage = 75;
        int income = 100000;
        String isElegible = percentage >=75 && income <200000 ? "Eligible" : "Not Elegible";
        System.out.println(isElegible);
    }
    }
