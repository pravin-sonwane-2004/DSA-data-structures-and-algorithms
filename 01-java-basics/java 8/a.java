public class a {

    static void main(String[] args) {
    MyFunc f = () -> System.out.println("Doing actual work");
    f.doWork();
    MyFunc.logStart();
  }
}