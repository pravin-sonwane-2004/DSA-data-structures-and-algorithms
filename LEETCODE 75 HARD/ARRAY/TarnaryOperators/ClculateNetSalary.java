package TarnaryOperators;

/*

Q56. Write a Java expression using arithmetic and assignment operators to calculate net salary if:
basicSalary = 35000
taxRate = 12%
 Find netSalary.
 */

public class ClculateNetSalary {
    public static void main (String [] args) {
       int basicSalary = 35000;
        int taxRate = 12;
        int taxAmount =basicSalary*taxRate/100;
        int netSalary = basicSalary-taxAmount;
        System.out.println(netSalary);
    }
}
