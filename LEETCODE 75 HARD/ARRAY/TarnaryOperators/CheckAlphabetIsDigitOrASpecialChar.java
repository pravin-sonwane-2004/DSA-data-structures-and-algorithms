package TarnaryOperators;

import java.util.Scanner;

//Q40. Write a java program to input any character and
// check whether it is alphabet, digit or special character.
public class CheckAlphabetIsDigitOrASpecialChar {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);

            String whatIsIt =
                    (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                            ? "Alphabet"
                    : c>='0' && c<='9'
                    ? "it is a number"
                    :  "not a alphabet";



            System.out.println(whatIsIt);
    }
}
