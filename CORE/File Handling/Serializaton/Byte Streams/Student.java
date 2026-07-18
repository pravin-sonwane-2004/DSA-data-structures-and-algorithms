import java.io.*;

public class Student implements Serializable {
    // Recommended for Serializable classes to verify class compatibility during deserialization
    private static final long serialVersionUID = 1L;

    // Encapsulated fields (private)
    private int id;
    private String name;
    private String email;

    // Parameterized Constructor
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // --- GETTER AND SETTER METHODS ---

    // ID Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Name Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Email Getter and Setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
