

// //index:   0  1  2  3
// // nums=[3,-2,1,1]

// [1,1,1,3]```:contentReference[oaicite:7]{index=7}

// ###🧠Key Insight

// Instead of looping manually left/right and wrapping over the corners yourself,
// you use a modulo trick:

// -`n`is the array length.-Adding`n`before`%n`ensures the result never goes 
// negative for left movement.-`%n`wraps everything into the range`[0,n‑1]`.
// :contentReference[oaicite:8]{index=8}

// ---

// ###🛑Important Notes

// -You must always look up`nums[...]`from the**original array**,
// not the partially built result.
// :contentReference[oaicite:9]{index=9}-This is not about sorting,just jumping around the circular array.

// ---

// If you want,I can walk you step‑by‑step through an 
// 
//implementation*and*help you visualize how the modulo trick works in code.:
// :contentReference[oaicite:10]{index=10}

//im not able to do that 

public class Leetcode3379 {
    public int[] constructTransformedArray(int[] nums) {
        int [] result = new int [nums.length];

        for(int i=0;i<nums.length;i++) {
            nums[0]=nums.length-1 ;
        }
        return result;
    }
    void main() {
        int[] nums = {1, 1, 1, 3};
    }
}
