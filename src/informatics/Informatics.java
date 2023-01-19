package informatics;

import java.util.Scanner;
import y22.m12.d01.A4_26;
import y23.m01.d12.A4_35;
import y23.m01.d19.Fachbereich;
import y23.m01.d19.Vorlesung;

public class Informatics {

    public static void main(String[] args) {
        
        /*
        Fachbereich powi = new Fachbereich("Politikwissenschaften", 2, 001);
        Vorlesung einstieg = new Vorlesung(001, "Einstieg Politikwissenschaften");
        Vorlesung staatsformen = new Vorlesung(002, "Staatsformen");
       */
        
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Name des Fachbereich: ");
        String fName = s.nextLine();
        
        System.out.println("ID: ");
        int fID = Integer.parseInt(s.nextLine());
        
        System.out.println("Der Fachbereich wurde erstellt, Sie müssen nun zwei Vorlesungen erstellen!");
        
        System.out.println("Name der ersten Vorlesung: ");
        String vName = s.nextLine();
        
        System.out.println("ID der ersten Vorlesung: ");
        int vID = Integer.parseInt(s.nextLine());
        
        System.out.println("Name der zweiten Vorlesung: ");
        String vName1 = s.nextLine();
        
        System.out.println("ID der zweiten Vorlesung: ");
        int vID1 = Integer.parseInt(s.nextLine());
        
        Fachbereich fachbereich = new Fachbereich(fName, 2, fID);
        Vorlesung vorlesung = new Vorlesung(vID, vName);
        Vorlesung vorlesung1 = new Vorlesung(vID1, vName1);
        
        System.out.println(fachbereich);
        System.out.println(vorlesung);
        System.out.println(vorlesung1);
        
        
        
        
        
    }
    
    
}
