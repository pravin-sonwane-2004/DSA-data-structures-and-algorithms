import java.util.*;


/*Q2.Problem Statement:
 Write a Java program to store string values in an ArrayList and sort them alphabetically using Comparable.
Input:
 ["Banana", "Apple", "Mango", "Cherry"]
Output:
 ["Apple", "Banana", "Cherry", "Mango"]*/

public class Practice{
	 public static void main(String[] args){
		ArrayList<Alpha> al=new ArrayList<>();
		al.add(new Alpha("Banana"));
		al.add(new Alpha("Mango"));
		al.add(new Alpha("Cherry"));
		
		Collections.sort(al);
		IO.println(al);         
	}
 }