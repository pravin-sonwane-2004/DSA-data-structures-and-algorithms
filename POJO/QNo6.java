// Q1. Create a POJO class Employee with the following fields:
// empId (int)
// name (String)
// salary (double)
// experience (int – in years)

// Calculate bonus based on experience:
// Experience ≥ 5 years → 10% bonus
// Experience < 5 years → 5% bonus

// Display employee details along with bonus amount and final salary.

// Explanation:
// Create POJO class with private variables.
// Use getters to access values.
// Calculate bonus using logic in main method.

// Print final salary.
 // Input:
// Enter Employee ID: 101
// Enter Name: Amit
// Enter Salary: 50000
// Enter Experience: 6

// Output:
// Employee ID: 101
// Name: Amit
// Original Salary: 50000.0
// Bonus: 5000.0
// Final Salary: 55000.0

class QNo6{
	
}

public class Employee {
    private int empId;
    private String name;
    private int salary;
    private int experience;

    // Getter and Setter for empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for salary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        // Optional: add validation logic here
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative or zero.");
        }
    }

    // Getter and Setter for experience
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        // Optional: add validation logic here
        if (experience >= 0) {
            this.experience = experience;
        } else {
            System.out.println("Experience cannot be negative.");
        }
    }
}
