class FullTimeEmployee extends Employee {
    int salary;
    FullTimeEmployee(int salary,String name) {
        this.salary = salary;
        super.name = name;
    }
    void calculateSalary() {
        super.salary = salary;
    }
    @Override
    void show () {
        IO.println("For Full Tyme Employee -> Name " + name + "Salary " + " - > " + salary);
    }
}