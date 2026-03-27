abstract class Employee {
    String name;
    int salary;
    abstract void calculateSalary();

    void show () {
        IO.println("Name " + name + "Salary " + " - > " + salary);
    }

}