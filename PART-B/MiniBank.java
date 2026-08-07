import java.util.Scanner;

record BankInfo(String name, String branch) {}

enum MenuOption {
    OPEN_ACCOUNT,
    DEPOSIT,
    WITHDRAW,
    TRANSFER,
    EXIT
}

public class MiniBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankInfo b = new BankInfo("MiniBank", "Anand");

        System.out.println("===== " + b.name() + " =====");
        System.out.println("Branch : " + b.branch());

        while (true) {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            MenuOption m = switch (ch) {
                case 1 -> MenuOption.OPEN_ACCOUNT;
                case 2 -> MenuOption.DEPOSIT;
                case 3 -> MenuOption.WITHDRAW;
                case 4 -> MenuOption.TRANSFER;
                case 5 -> MenuOption.EXIT;
                default -> null;
            };

            if (m == null) {
                System.out.println("Invalid Choice");
                continue;
            }

            switch (m) {

                case OPEN_ACCOUNT ->
                    System.out.println("Open Account - To be implemented later");

                case DEPOSIT ->
                    System.out.println("Deposit - To be implemented later");

                case WITHDRAW ->
                    System.out.println("Withdraw - To be implemented later");

                case TRANSFER ->
                    System.out.println("Transfer - To be implemented later");

                case EXIT -> {
                    System.out.println("Thank You!");
                    sc.close();
                    return;
                }
            }
        }
    }
}