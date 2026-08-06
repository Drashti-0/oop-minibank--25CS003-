public class Driver2 {

    public static void main(String[] args) {

        Card[] card = new Card[5];

        card[0] = new Card("Ace", "Spades");
        card[1] = new Card("King", "Hearts");
        card[2] = new Card("Queen", "Clubs");
        card[3] = new Card("Ace", "Spades");
        card[4] = new Card("Jack", "Diamonds");

        boolean found = false;

        for (int i = 0; i < card.length; i++) {

            for (int j = 0; j < i; j++) {

                if (card[i].equals(card[j])) {

                    System.out.println("Duplicate found: " + card[i]);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }
    }
}