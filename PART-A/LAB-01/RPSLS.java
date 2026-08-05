import java.util.Scanner;
import java.util.Random;

enum Move {
    ROCK, PAPER, SCISSORS, LIZARD, SPOCK
}

public class RPSLS {

    static int winner(Move a, Move b) {

        if (a == b) {
            return 0;
        }

        return switch (a) {

            case ROCK ->
                (b == Move.SCISSORS || b == Move.LIZARD) ? 1 : -1;

            case PAPER ->
                (b == Move.ROCK || b == Move.SPOCK) ? 1 : -1;

            case SCISSORS ->
                (b == Move.PAPER || b == Move.LIZARD) ? 1 : -1;

            case LIZARD ->
                (b == Move.SPOCK || b == Move.PAPER) ? 1 : -1;

            case SPOCK ->
                (b == Move.SCISSORS || b == Move.ROCK) ? 1 : -1;
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int us = 0;
        int cs = 0;

        Move[] m = Move.values();

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter move (ROCK, PAPER, SCISSORS, LIZARD, SPOCK): ");
            Move u = Move.valueOf(sc.next());

            Move c = m[r.nextInt(5)];

            System.out.println("You: " + u);
            System.out.println("Computer: " + c);

            int x = winner(u, c);

            if (x == 1) {
                System.out.println("You win this round");
                us++;
            } else if (x == -1) {
                System.out.println("Computer wins this round");
                cs++;
            } else {
                System.out.println("Round Tie");
            }

            System.out.println();
        }

        if (us > cs) {
            System.out.println("You win " + us + "-" + cs);
        } else if (cs > us) {
            System.out.println("Computer wins " + cs + "-" + us);
        } else {
            System.out.println("Match Tie " + us + "-" + cs);
        }

        sc.close();
    }
}