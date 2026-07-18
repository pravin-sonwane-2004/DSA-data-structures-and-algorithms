import java.util.Comparator;

public class CompareBySalary implements Comparator <Products> {

    @Override
    public int compare(Products p1,Products p2) {
        return Integer.compare(p1.salary,p2.salary);
    }
}
