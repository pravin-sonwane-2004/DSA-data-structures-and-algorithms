package Matrix;
// 1572. Matrix Diagonal Sum Solved Easy Topics premium lock icon Companies Hint Given a square matrix mat,return the sum of the matrix diagonals.

// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

// Example 1:

// Input:mat=[[1,2,3],[4,5,6],[7,8,9]]Output:25 Explanation:Diagonals sum:1+5+9+3+7=25 Notice that element mat[1][1]=5 is counted only once.Example 2:

// Input:mat=[[1,1,1,1],[1,1,1,1],[1,1,1,1],[1,1,1,1]]Output:8 Example 3:

// Input:mat=[[5]]Output:5

public class Leetcode1572DiagonalSum {
    
    void main() {
        // int arr[][] = {
        //         { 1, 2, 3 },
        //         { 4, 5, 6 },
        //         { 7, 8, 9 }
        // };
        int arr [] [] =  {{1,1,1,1},
              {1,1,1,1},
              {1,1,1,1},
              {1,1,1,1}
    };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        }
        IO.println(sum);
    }
}
