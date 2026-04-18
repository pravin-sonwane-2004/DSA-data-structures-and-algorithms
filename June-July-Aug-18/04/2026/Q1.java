// Q1. Write a Java program to find the second largest distinct element in an integer array.
//  If the second largest distinct element does not exist, print -1.
// Description :-The array may contain duplicate values. You must consider only distinct
// numbers.
//  Input :-
// • First line contains integer n
// • Second line contains n space-separated integers
//  Output :- Print the second largest distinct element.
//  Input - 7 3 9 9 5 7
//  Output - 7
//  Explanation :-
// Distinct elements = {3,5,7,9}
// Second largest = 7

import java.util.Arrays;
import java.util.Scanner;

class Q1{
    void main() {
        Scanner sc = new Scanner(System.in);

        IO.print("Enter The Size");
        int size = sc.nextInt();
        int arr [] = new int[size];
        IO.print("Enter Elements");
        for(int i = 0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        IO.println(Arrays.toString(arr));
    }
}