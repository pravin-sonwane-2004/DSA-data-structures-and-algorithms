package TarnaryOperators;

public class CheckCharacterIsAlphabeticOrNot {
    public static void main(String [] args) {
        char c = 'p';
        //this method is exist in hava we have to just to call it
//        if(Character.isAlphabetic(c)) {
//            System.out.println(c + " is alphabetic");
//        }
        //this is treditional way to do that
//        if(c>='A' && c<='Z' || c>='a' && c<='z' ) {
//            System.out.println(c + " is alphabetic");
//        }
//        else {
//                        System.out.println(c + " is not alphabetic");
//        }
        //right now we are into turnary (Conditional Statements so thats why we need
        // to do thid in turnary way

        String b = ((c>='a' && c<='z') ||  (c>='A' && c<='Z'))
                // here dont make misteks because this can lead to mistek
                ? c + " is a alphabetic"
                : c +" Is not Alphabetic";
                    System.out.println(b);
    }
}
