/*Q2.Problem Statement:
 Write a Java program to store string values in an ArrayList and sort them alphabetically using Comparable.
Input:
 ["Banana", "Apple", "Mango", "Cherry"]
Output:
 ["Apple", "Banana", "Cherry", "Mango"]*/

public class Alpha implements Comparable<Alpha>{
	 public Alpha(){}
	 
	 String str;
	 public Alpha(String str){
		 this.str=str;
	 }

    @Override
	 public int compareTo(Alpha another){
		 return this.str.compareTo(another.str);
	 }
}
 
