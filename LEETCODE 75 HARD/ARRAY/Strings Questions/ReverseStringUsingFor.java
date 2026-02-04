
public class ReverseStringUsingFor {
    public static void main(String [] args) {
        String str = "Pravin";
        reverse(str);
        reverseWhile(str);

    }
    public static void reverse (String str) {
        char [] charArr = str.toCharArray();
        for(int i = charArr.length-1;i>=0;i--) {
            System.out.println(charArr[i]);
        }
    }

    public static void reverseWhile(String str) {
        char [] newArr = str.toCharArray();
        int left = 0;
        int right = newArr.length-1;
        while(left<right) {
            char temp = newArr[right];
            newArr[right] = newArr[left];
            newArr[left] = temp;
            left++;
            right--;
        }
        System.out.println(newArr);

    }
}
