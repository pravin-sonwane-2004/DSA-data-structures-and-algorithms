package TarnaryOperators;

//Q37. Write a Java program to input cost price and selling price of a product
// and check profit or loss.
public class ProfitAndLoss {
    public static void main(String[] args) {
        int costPrice = 100;
        int sellingPrice = 100;

        String calc = costPrice > sellingPrice
                ? "You are in loss"
                : costPrice == sellingPrice
                ? "No profit, no loss"
                : "You made a profit";

        System.out.println(calc);
    }
}

