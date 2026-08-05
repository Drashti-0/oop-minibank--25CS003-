import java.util.Scanner;

record Vehicle(String number, String type) {}

public class TollBooth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = 0;
        int b = 0;
        int c = 0;
        int tr = 0;

        while (true) {

            System.out.print("Enter vehicle number (done to stop): ");
            String n = sc.next();

            if (n.equals("done")) {
                break;
            }

            System.out.print("Enter type (bike/car/truck): ");
            String ty = sc.next();

            Vehicle v = new Vehicle(n, ty);

            int toll = switch (v.type()) {
                case "bike" -> 20;
                case "car" -> 50;
                case "truck" -> 150;
                default -> 0;
            };

            t = t + toll;

            switch (v.type()) {
                case "bike" -> b++;
                case "car" -> c++;
                case "truck" -> tr++;
            }
        }

        System.out.println("Total toll: " + t);

        if (b >= c && b >= tr) {
            System.out.println("Most frequent: bike");
        } else if (c >= b && c >= tr) {
            System.out.println("Most frequent: car");
        } else {
            System.out.println("Most frequent: truck");
        }

        sc.close();
    }
}