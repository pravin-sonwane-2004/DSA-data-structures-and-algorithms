
//sum of digits

public class DigitSumPractice {

    public static void main (String [] args) {
        int num = 12345;
        int last = 0;
        int sum =0;
//      while(num>0) {//0>0
//          num = num%10;//5  4 3 2  1
//          sum += num;//5  9  12 14  15
//          num=num/10;//12 1  0
//          System.out.println(sum);//5 9 12 14 15
//      }
            int i = num;   //5    //4   3   2   1    0
            for(i = 0;i<num ; i++) { //12345<12345
                num = num%10;   //5   4   3  2  1
                sum += num;   //5+4 = 9    +3 = 12 +2 = 14+1
                num = num/10;   //1234    123   12  1  0
            }
        System.out.println(sum);

    }
}
