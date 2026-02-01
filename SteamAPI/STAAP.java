import java.util.ArrayList;
import java.util.Vector;

class STAAP {
    public void main() throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();//\\
        // Vector <Integer> list = new Vector();
        Thread t1 = new Thread (() ->
        {
            for(int i=0;i<100;i++) {
                list.add(i);
            }
        });

        Thread t2 = new Thread (() -> {
            for(int i=0;i<100;i++) {
                list.add(i);
            }
        });
        t1.start();
        t2.start();
        
        t1.join(); // Wait for t1 to finish
        t2.join(); // Wait for t2 to finish

        IO.println(list.size());
    }
}