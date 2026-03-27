import java.util.Scanner;

class Main {
    void main() {
    Scanner sc = new Scanner(System.in);
        IO.println("Enter Detials");

        IO.println("Enter The Job Type: ");
        String t = sc.nextLine().trim();
        JobType type = JobType.valueOf(t.toUpperCase());
        if(type == JobType.PARTTIME) {
            PartTimeEmployee pt = new PartTimeEmployee("Pravin Sonwane  ",2000,30);
            pt.calculateSalary();
            pt.show();
        }
        else if (type == JobType.FULLTIME) {
            FullTimeEmployee fe = new FullTimeEmployee(3000,"Saurabh ");
            fe.calculateSalary();
            fe.show();
        }
        else {
            throw new RuntimeException("cant find the type that you typed ");
        }
    }
}