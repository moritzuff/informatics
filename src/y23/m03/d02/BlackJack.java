package y23.m03.d02;

import java.util.Scanner;

public class BlackJack {

    Scanner scanner = new Scanner(System.in);

    String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Bube", "Dame", "König", "Ass"};
    int[] points = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
    int playerPoints = 0;
    int dealerPoints = 0;

    int maximum = cards.length;
    
    boolean state = true;

    private int getNumber() {
        return (int) (maximum * Math.random());
    }

    private void addCard() {
        System.out.println("SPIELER: Willst du eine weitere Karte ziehen?");
        int answer = Integer.parseInt(scanner.nextLine());

        switch (answer) {
            case 0:
                int t = getNumber();
                System.out.println("SPIELER: Weitere Karte: " + cards[t]);
                playerPoints += points[t];

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
            case 1:
                System.out.println("SPIELER: Der Croupier ist nun am Zug. Deine Punktzahl: " + playerPoints);
                state = false;
                break;
        }
    }
    
    private void croupier() {
        int twoCroupier = getNumber();
        System.out.println("CROUPIER: Zweite Karte des Croupier: " + cards[twoCroupier]);
        dealerPoints += points[twoCroupier];
        if (dealerPoints == 21) {
            System.out.println("SPIEL: Die Punktzahl des Croupiers ist 21, damit hast du verloren!");
        } else if (dealerPoints > 16) {
            if (dealerPoints > playerPoints) {
                System.out.println("SPIEL: Der Croupier hat " + dealerPoints + " Punkte und du hast nur " + playerPoints + " Punkte, damit hast du verloren!");
            } else {
                System.out.println("SPIEL: Der Croupier hat nur " + dealerPoints + " Punkte und du hast" + playerPoints + " Punkte, damit hast du gewonnen!");
            }
        } else {
            
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
        playerPoints += points[two];
        dealerPoints += points[oneCroupier];
        System.out.println("SPIELER: Deine aktuelle Punktzahl: " + playerPoints);

        while (state) {
            addCard();
        }
        
        croupier();

    }
}