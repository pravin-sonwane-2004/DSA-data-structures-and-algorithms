package Math;
/*
Q39. Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.

 */

public class DisplayCommissionLogic {
    public static void main (String [] args) {
        int sales = 10000;
        double commission;
        if(sales < 5000) {
            commission = sales*0.02;
        }
        else if (sales <= 10000) {
            commission = sales*0.05;
        }
        else {
            commission = sales*0.10;
        }

        System.out.println("Commission = " + commission);
    }
}
