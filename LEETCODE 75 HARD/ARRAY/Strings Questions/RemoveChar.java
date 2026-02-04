
class RemoveChar {
    public static void main(String [] args) {
        String s = "pravin";
        System.out.println(returnString(s,'p'));
    }
    public static String returnString(String str , char c) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length();i++) {
                if(str.charAt(i)!=c) {
                    sb.append(str.charAt(i));
                }
        }
        return sb.toString();
    }
}