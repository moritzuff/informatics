package y22.m12.d01;

import java.util.Scanner;

public class A4_26 {

    public void berechneQuersumme() {
        //123
        // Scanner wird erstellt
        System.out.println("Gebe eine Zahl ein und die Quersumme wird berechnet: ");
        Scanner scanner = new Scanner(System.in);
        int zahl;
        
        // While-Schleife um Fehler abzufangen & Abfragesystem
        while (true) {
            // try --> versucht es
            try {
                zahl = Integer.parseInt(scanner.nextLine());
            // catch --> er fängt den Fehler ab und eine neue (richtige) Zahl kann eingegeben werden
            } catch (NumberFormatException e) {
                System.out.println("Du kannst nur eine Zahl bis maximal 99999 eingeben!");
                continue;
            }

            // Abfragesystem, ob Zahl den Richtlinien entspricht
            if (zahl < 1 || zahl > 9999) {
                System.out.println("Du kannst nur eine Zahl bis maximal 99999 eingeben!");
                continue;
            }
            break;
        }

        // Die Zahlen werden in einen Char Array eingelesen & zu einem String umgeformt
        char[] digits = String.valueOf(zahl).toCharArray();

        // Variable für die for each Schleife
        int ergebnis = 0;

        // Die Schleife geht durch den Char Array und addiert das Ergebnis
        for (char digit : digits) {
            ergebnis += digit - '0';
        }

        System.out.println(ergebnis);
    }
}
