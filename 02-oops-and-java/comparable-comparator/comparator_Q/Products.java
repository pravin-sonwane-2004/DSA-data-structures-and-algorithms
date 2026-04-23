public class Products {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id;
    int salary;
    String name;
    Products() {}

    @Override
    public String toString() {
        return salary + " " + id + " " + name;
    }

    public Products(int salary, int id, String name) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

}
