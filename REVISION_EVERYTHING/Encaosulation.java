class Human {
    private final String name = "Pravin";
    private final int age = 20;

    public String getname () {
        return name;
    }
    public int getage() {
        return age;
    }
}

public class Encaosulation {

    static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getname()+" : " +obj.getage());
     }
}