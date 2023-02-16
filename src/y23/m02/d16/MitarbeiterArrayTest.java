package y23.m02.d16;

import java.util.Scanner;

public class MitarbeiterArrayTest {
    
    // Array vom Objekttyp Mitarbeiter aus Mitarbeiter.java wird vorgemerkt
    private Mitarbeiter[] mitarbeiter;
    
    private double[] gehaltx;
    private int anzahl;

    public MitarbeiterArrayTest() {
        // Scanner für Eingaben & Ausgabe für die erste Eingabe
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Mitarbeiter sollen verwaltet werden?: ");
        
        // Anzahl an Mitarbeitern, die erstellt werden sollen
        anzahl = Integer.parseInt(scanner.nextLine());
        
        
        
        // leere Mitarbeiter Objekte kommen in den Array
        mitarbeiter = new Mitarbeiter[anzahl];
        gehaltx = new double[anzahl];
        
        // Die Objekte im Array werden befüllt
        for (int i = 0; i < mitarbeiter.length; i++) {
            System.out.println("Geben Sie den Namen des Mitarbeiters " + (i + 1) + ". ein: ");
            String name = scanner.nextLine();
            System.out.println("Geben Sie das Gehalt des Mitarbeiters " + (i + 1) + ". ein: ");
            double gehalt = Double.parseDouble(scanner.nextLine());
            // Mitarbeiter XY wird initialisiert
            mitarbeiter[i] = new Mitarbeiter(name, gehalt);
            
            gehaltx[i] = gehalt;
        }

        ausgabe();
    }

    public void ausgabe() {
        System.out.println();
        System.out.println("############################");
        for (int i = 0; i < mitarbeiter.length; i++) {
            mitarbeiter[i].ausgeben();
        }
        System.out.println("############################");
        
        
        double gehaltg = 0;
        double gehaltarit = 0;
        
        for (int i = 0; i < gehaltx.length; i++) {
            gehaltg += gehaltx[i];
            gehaltarit = gehaltg / anzahl;
        }
        
        System.out.println("Durchschnittliches Gehalt aller Mitarbeiter: " + gehaltarit);
    }

}