
public class FindShortestPath {
    public static void main(String [] args) {
        String str = "WNENESENN";
        System.out.println(returnPathValue(str));
    }
    public static double returnPathValue(String str) {
        int x = 0;
        int y = 0;
        for(int i =0;i<str.length();i++) {
            char dir = str.charAt(i);
            if(dir == 'E') {
              x++;
            }
            else if(dir == 'W') {
                x--;
            }
            else if(dir=='N') {
                y++;
            }
            else {
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return Math.sqrt(x2+y2);
    }
}
