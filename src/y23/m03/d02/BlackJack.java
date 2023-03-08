package y23.m03.d02;

import java.util.Scanner;

//TODO: Zweites Ass ungültig machen // 1 machen
public class BlackJack {

    Scanner scanner = new Scanner(System.in);

    String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Bube", "Dame", "König", "Ass"};
    int[] points = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
    int playerPoints = 0;
    int dealerPoints = 0;

    int maximum = cards.length;

    boolean state = true;
    boolean dealerState = true;

    private int getNumber() {
        return (int) (maximum * Math.random());
    }

    private void addCard() {
        System.out.println("SPIELER: Willst du eine weitere Karte ziehen?");
        String answer = scanner.nextLine();

        switch (answer.toLowerCase()) {
            case "ja":
                int t = getNumber();
                System.out.println("SPIELER: Weitere Karte: " + cards[t]);

                // "Ass-Absicherung"
                if (points[t] == 11 && playerPoints >= 11) {
                    playerPoints += 1;
                } else {
                    playerPoints += points[t];
                }

                if (playerPoints == 21) {
                    System.out.println("SPIEL: Deine Punktzahl ist 21, damit hast du gewonnen!");
                    state = false;
                } else if (playerPoints > 21) {
                    System.out.println("SPIEL: Du hast " + playerPoints + " Punkte, damit hast du verloren!");
                    state = false;
                } else {
                    System.out.println("SPIELER: Deine aktuelle Punktzahl: " + playerPoints);
                }
                break;
            case "nein":
                System.out.println("SPIELER: Der Croupier ist nun am Zug. Deine Punktzahl: " + playerPoints);
                state = false;
                break;
        }
    }

    private void addDealerCard() {

        int t = getNumber();
        System.out.println("CROUPIER: Weitere Karte: " + cards[t]);
        dealerPoints += points[t];

        if (dealerPoints == 21) {
            System.out.println("SPIEL: Der Croupier hat 21 Punkte, damit hast du verloren!");
            dealerState = false;
        } else if (dealerPoints > 21) {
            System.out.println("SPIEL: Der Dealer hat " + dealerPoints + ", damit hast du gewonnnen!");
            dealerState = false;
        } else if (dealerPoints >= 17) {
            if (dealerPoints > playerPoints) {
                System.out.println("SPIEL: Der Croupier hat " + dealerPoints + " Punkte und du hast nur " + playerPoints + " Punkte, damit hast du verloren!");
                dealerState = false;
            } else if (dealerPoints == playerPoints) {
                System.out.println("SPIEL: Der Croupier hat " + dealerPoints + " Punkte und du hast " + playerPoints + " Punkte, damit ist es ein Nullspiel!");
                dealerState = false;
            } else {
                System.out.println("SPIEL: Der Croupier hat nur " + dealerPoints + " Punkte und du hast " + playerPoints + " Punkte, damit hast du gewonnen!");
                dealerState = false;
            }

        }
    }

    public void startBlackJack() {

        int one = getNumber();
        int oneCroupier = getNumber();
        int two = getNumber();
        System.out.println("SPIELER: Deine erste Karte: " + cards[one]);
        System.out.println("CROUPIER: Erste Karte des Croupier: " + cards[oneCroupier]);
        System.out.println("SPIELER: Deine zweite Karte: " + cards[two]);
        playerPoints += points[one];
        // "Ass-Absicherung"
        if (points[two] == 11) {
            playerPoints += 1;
        } else {
            playerPoints += points[two];
        }

        if (playerPoints == 21) {
            System.out.println("SPIEL: Deine Punktzahl ist 21, damit hast du gewonnen!");
            state = false;
        }
        dealerPoints += points[oneCroupier];
        System.out.println("SPIELER: Deine aktuelle Punktzahl: " + playerPoints);

        while (state) {
            addCard();
        }

        if (playerPoints < 21) {
            int twoCroupier = getNumber();
            dealerPoints += points[twoCroupier];
            System.out.println("CROUPIER: Zweite Karte des Croupier: " + cards[twoCroupier]);
            if (dealerPoints == 21) {
                System.out.println("SPIEL: Der Croupier hat 21 Punkte, damit hast du verloren!");
                dealerState = false;
            }
            System.out.println("CROUPIER: Punkte des Croupier: " + dealerPoints);
            while (dealerState) {
                addDealerCard();
            }
        }
    }
}
