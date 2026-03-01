import java.util.Scanner;

class QNo5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Food[] food = new Food[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1. Add Food Details");
            System.out.println("2. Display All Food Details");
            System.out.println("3. Display Bill Without GST");
            System.out.println("4. Display Bill With 18% GST");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < food.length) {
                        food[count] = new Food();

                        System.out.print("Enter Food ID: ");
                        food[count].setFoodId(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Enter Food Name: ");
                        food[count].setFoodName(sc.nextLine());

                        System.out.print("Enter Food Price: ");
                        food[count].setFoodPrice(sc.nextDouble());
                        sc.nextLine();

                        System.out.print("Enter Food Category: ");
                        food[count].setFoodCategory(sc.nextLine());

                        count++;
                    } else {
                        System.out.println("Food List Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Food Added Yet.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            food[i].displayFood();
                        }
                    }
                    break;

                case 3:
                    double total = 0;
                    for (int i = 0; i < count; i++) {
                        total += food[i].getFoodPrice();
                    }
                    System.out.println("Total Bill Without GST: " + total);
                    break;

                case 4:
                    double totalWithGST = 0;
                    for (int i = 0; i < count; i++) {
                        totalWithGST += food[i].getFoodPrice();
                    }
                    double gst = totalWithGST * 0.18;
                    System.out.println("Bill Amount: " + totalWithGST);
                    System.out.println("GST (18%): " + gst);
                    System.out.println("Total Bill With GST: " + (totalWithGST + gst));
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
class Food {

    private int fid;
    private String fname;
    private double fprice;
    private String fcategory;

    public void setFoodId(int fid) {
        this.fid = fid;
    }

    public void setFoodName(String fname) {
        this.fname = fname;
    }

    public void setFoodPrice(double fprice) {
        this.fprice = fprice;
    }

    public void setFoodCategory(String fcategory) {
        this.fcategory = fcategory;
    }

    public double getFoodPrice() {
        return fprice;
    }

    public void displayFood() {
        System.out.println(fid + " | " + fname + " | " + fprice + " | " + fcategory);
    }
}