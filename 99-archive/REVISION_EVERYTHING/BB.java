import java.util.Arrays;

public class Employee {
    // Fields
    private int id;
    private int sal;
    private String name;

    // Constructor
    public Employee(int id, int sal, String name) {
        this.id = id;
        this.sal = sal;
        this.name = name;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class BB {
     void main() {
			Employee arr [] = new Employee[4];
			
			for(int i=0;i<arr.length;i++) {
				arr[i] = new Employee(i+1,i+1000,i+"Pravin");
			}
			for(int i=0;i<arr.length;i++) {
			IO.println(arr[i].getSal()+"  "+ arr[i].getId()+ "  " + arr[i].getName());
			}
	 }
}
