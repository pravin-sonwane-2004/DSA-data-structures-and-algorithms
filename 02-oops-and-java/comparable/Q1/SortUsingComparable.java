import java.util.*;

class StrData implements Comparable<StrData> {
    private String name;

    StrData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(StrData other) {
        // Uses the built-in String comparison logic
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class SortUsingComparable {
    public static void main(String[] args) {
        List<StrData> list = new ArrayList<>();
        list.add(new StrData("pravin"));
        list.add(new StrData("this"));
        list.add(new StrData("young"));

        // Sorts using the compareTo method defined in StrData
        Collections.sort(list);

        System.out.println("Sorted list: " + list);
    }
}
