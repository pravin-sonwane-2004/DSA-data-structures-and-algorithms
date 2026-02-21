public class ReverseString {
    static void main(String[] args) {
        String s = "pravin";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length;
        while (left < right) {
            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
