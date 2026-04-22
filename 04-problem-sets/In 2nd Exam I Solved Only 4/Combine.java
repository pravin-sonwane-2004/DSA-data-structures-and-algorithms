import java.util.*;

class Combine {

    static void findUnionAndIntersection(int[] arr1, int[] arr2) {
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        System.out.print("Union: ");
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " ");
            }
            else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j++] + " ");
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        while (i < arr1.length)
            System.out.print(arr1[i++] + " ");

        while (j < arr2.length)
            System.out.print(arr2[j++] + " ");

        // Reset pointers for intersection
        i = 0; 
        j = 0;

        System.out.print("\nIntersection: ");
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr1[i]) {
                j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4,5};

        findUnionAndIntersection(arr1, arr2);
    }
}