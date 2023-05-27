package y23.m05.d24;

import java.util.Scanner;

public class SortStrings {
    
    public static void sortArrays(Person[] personen) {
        
        //Personen Array zu Strings
        StringBuilder sb = new StringBuilder();
        
        for (Person p : personen) {
            sb.append(p.toString()).append(", ");
        }
        String result = sb.toString();
        
        //Liste: XY, YX, ZY wird geteilt
        String[] namen = result.split(", ");
        
        //String[] wird sortiert
        int n = namen.length;
        for (int i = 1; i < n; i++) {
            String key = namen[i];
            int j = i - 1;
            
            while (j >= 0 && namen[j].compareTo(key) > 0) {
                namen[j + 1] = namen[j];
                j--;
            }
            
            namen[j + 1] = key;
        }
        
        sb.delete(0, sb.length());
        
        for (String s : namen) {
            sb.append(s).append(", ");
        }
        
        String namenResult = sb.toString();
        String[] ausgabe = namenResult.split(", ");
        
        System.out.println("Sortierte Liste wird geladen..");
        for (String string : ausgabe) {
            System.out.println(string);
        }
        
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Wie viele Personen wollen Sie erstellen?");
        int x = 0;
        try {
            x = Integer.parseInt(s.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Du kannst nur eine Zahl eingeben.");
            main(args);
            return;
        }

        Person[] personen = new Person[x];
        
        for (int i = 0; i < x; i++) {
            String nachname =  nachnameAbfrage(s);
            String vorname = vornameAbfrage(s);
            personen[i] = new Person(nachname, vorname);
            System.out.println("Die Person " + nachname + " " + vorname + " wurde erstellt.");
        }
        
        sortArrays(personen);
    }

    private static String nachnameAbfrage(Scanner s) {
        System.out.println("Nachname:");
        String nachname = s.nextLine();

        if (nachname.isEmpty()) {
            return nachnameAbfrage(s);
        }
        return nachname;
    }

    private static String vornameAbfrage(Scanner s) {
        System.out.println("Vorname:");
        String vorname = s.nextLine();

        if (vorname.isEmpty()) {
            return vornameAbfrage(s);
        }
        return vorname;
    }
    
    
}
