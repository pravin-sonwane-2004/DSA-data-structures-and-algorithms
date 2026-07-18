import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// 1. THE ENTITY CLASS (Can be kept in the same file as a non-public class)
@Entity
@Table(name = "students")
class Student {
    @Id
    private int id;
    private String name;

    // Hibernate requires a no-argument constructor
    public Student() {}

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

// 2. THE MAIN EXECUTION CLASS
public class HibernateSingleFileDemo {

    public static void main(String[] args) {
        
        // PROGRAMMATIC CONFIGURATION (No XML files needed)
        Configuration cfg = new Configuration();
        
        // Database connection settings
        cfg.setProperty("hibernate.connection.driver_class", "org.h2.Driver");
        cfg.setProperty("hibernate.connection.url"Q, "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");
        cfg.setProperty("hibernate.connection.username", "root");
        cfg.setProperty("hibernate.connection.password", "0000");
        
        // Hibernate behavior settings
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        cfg.setProperty("hibernate.hbm2ddl.auto", "update"); // Automatically creates the table
        cfg.setProperty("hibernate.show_sql", "true");        // Prints generated SQL queries to console
        
        // Register the Entity class directly
        cfg.addAnnotatedClass(Student.class);

        // Build the SessionFactory and execute CRUD operations
        try (SessionFactory sessionFactory = cfg.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            
            // CREATE operation
            Transaction transaction = session.beginTransaction();
            Student newStudent = new Student(101, "Alice");
            session.persist(newStudent); 
            transaction.commit();
            System.out.println("Data saved successfully!");

            // READ operation
            Student retrievedStudent = session.find(Student.class, 101);
            System.out.println("Retrieved Student Name: " + retrievedStudent.getName());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// 1. THE ENTITY CLASS (Can be kept in the same file as a non-public class)
@Entity
@Table(name = "students")
class Student {
    @Id
    private int id;
    private String name;

    // Hibernate requires a no-argument constructor
    public Student() {}

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

// 2. THE MAIN EXECUTION CLASS
public class HibernateSingleFileDemo {

    public static void main(String[] args) {
        
        // PROGRAMMATIC CONFIGURATION (No XML files needed)
        Configuration cfg = new Configuration();
        
        // Database connection settings
        cfg.setProperty("hibernate.connection.driver_class", "org.h2.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");
        cfg.setProperty("hibernate.connection.username", "sa");
        cfg.setProperty("hibernate.connection.password", "");
        
        // Hibernate behavior settings
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        cfg.setProperty("hibernate.hbm2ddl.auto", "update"); // Automatically creates the table
        cfg.setProperty("hibernate.show_sql", "true");        // Prints generated SQL queries to console
        
        // Register the Entity class directly
        cfg.addAnnotatedClass(Student.class);

        // Build the SessionFactory and execute CRUD operations
        try (SessionFactory sessionFactory = cfg.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            
            // CREATE operation
            Transaction transaction = session.beginTransaction();
            Student newStudent = new Student(101, "Alice");
            session.persist(newStudent); 
            transaction.commit();
            System.out.println("Data saved successfully!");

            // READ operation
            Student retrievedStudent = session.find(Student.class, 101);
            System.out.println("Retrieved Student Name: " + retrievedStudent.getName());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
