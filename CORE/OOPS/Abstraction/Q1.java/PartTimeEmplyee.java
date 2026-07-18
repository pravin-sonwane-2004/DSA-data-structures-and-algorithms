//PartTimeEmployee ? hourly rate × hours worked
//
class PartTimeEmployee extends Employee {
    int hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name ,int hourlyRate, int hoursWorked) {
        super.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    void calculateSalary() {
       salary = hoursWorked * hourlyRate;
    }
    @Override
    void show () {
        IO.println("For Part Tyme Employee -> Name " + name + "Salary " + " - > " + salary);
    }
}