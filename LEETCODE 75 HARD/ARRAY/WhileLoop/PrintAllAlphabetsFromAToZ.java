package WhileLoop;
//Write a java program to print all alphabets from a to z. - using while loop

public class PrintAllAlphabetsFromAToZ {
    public static void main (String [] args) {
        char ch = 'a';
        while(ch>='a' && ch<='z') {
            System.out.println(ch);
            ch++;
        }
    }
}
