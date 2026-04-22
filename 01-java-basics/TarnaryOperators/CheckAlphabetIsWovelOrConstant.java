package TarnaryOperators;

//Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.Scanner;

public class CheckAlphabetIsWovelOrConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String whatIsIt =  (c == 'a' ||  c == 'e' ||  c == 'i' ||  c == 'o' ||  c ==  'u' || c ==  'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                ? "It is Vowel " : c<'z' && c>'a' ? "is it a constant" : "not a alphabet";
        System.out.println(whatIsIt);
    }
}
