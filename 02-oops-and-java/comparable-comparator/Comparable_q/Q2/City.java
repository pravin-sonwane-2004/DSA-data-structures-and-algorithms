// Q20.Problem Statement:
//  Store city names and sort in reverse alphabetical order using Comparator.
// Input:
//  ["Pune","Mumbai","Delhi"]
// Output:
//  Pune
//  Mumbai
//  Delhi

import java.util.*;

public class City {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Pune", "Mumbai", "Delhi");

        // Sort using Comparator (Reverse Order)
        Collections.sort(cities, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);   // reverse
            }
        });

        // Print this
        for(String city : cities) {
            System.out.println(city);
        }
    }
}
