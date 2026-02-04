package TarnaryOperators;
/*
Q44. Write a java program to input the basic salary of an employee and calculate
 its Gross salary according to the following.
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%

 */

public class SalaryOfAnEmployee {
        public static void main(String[] args) {
            double salary = 20000;
            double calculate = salary <= 10000
                    ? (salary/100 * 20)+ (salary/100*80)+salary
                    :  salary <= 20000
                    ? (salary/100 *25)+ (salary/100*90)+salary
                    :  salary > 20000
                    ? (salary/100 *30)+(salary/100*95)+salary
                    : 0 ;
            System.out.println(calculate);
        }
}
