public class Print2TO10Tables {
    public static void main(String[] args) throws Exception {
        for(int i = 2; i <= 10; i++) {       // rows start from 2
            for(int j = 2; j <= 10; j++) {   // columns also start from 2
                System.out.print(i+"i  ; "+ j+"j   ; ");
				Thread.sleep(200);
            }
            System.out.println();
        }
    }
}
