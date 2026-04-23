import java.util.Comparator;

public class CompareById implements Comparator<Products> {

    @Override
    public int compare(Products p1,Products p2) {
        return Integer.compare(p1.getId(),p2.getId());
    }
}
