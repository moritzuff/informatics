package informatics;

import java.io.IOException;
import java.util.Scanner;
import y22.m12.d01.A4_26;
import y23.m01.d12.A4_35;
import y23.m01.d12.A4_36;
import y23.m01.d19.Fachbereich;
import y23.m01.d19.Vorlesung;
import y23.m01.d26.*;
import y23.m02.d13.ArrayTestPrimitiveDatentypen;
import y23.m02.d16.MitarbeiterArrayTest;
import y23.m02.d16.svheidelburg.Schwimmbad;
import y23.m02.d16.svheidelburg.Sportstaette;
import y23.m02.d26.ArbeitsblattZu270223;

public class Informatics {

    public static void main(String[] args) throws IOException {

        //Black Jack
        new y23.m03.d02.BlackJack().startBlackJack();
           
        //new ArbeitsblattZu270223().arrayEinsBisZwanzig();
        //new ArbeitsblattZu270223().wetterstation();
        //new ArbeitsblattZu270223().mehrdimensionalerArray();
        //Sportstaette hallenbadHeek = new Schwimmbad(100, 0.5);
        //System.out.println("Grundgebühr: " + hallenbadHeek.gibGrundgebuehr());
        //System.out.println("Gesamtgebühr: " + hallenbadHeek.gibGesamtgebuehr());
        //new MitarbeiterArrayTest();
        //new ArrayTestPrimitiveDatentypen();
        //new A4_35().getWochentag();
        //new A4_36().getOstersonntag();
        /*
        Fachbereich powi = new Fachbereich("Politikwissenschaften", 2, 001);
        
        Vorlesung vorles1 = new Vorlesung(0, "Gzuz");
        Vorlesung vorles2 = new Vorlesung(1, "CL500");
        
       
        powi.setV1(vorles1);
        powi.setV2(vorles2);
         */
 /*
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

         */
    }

}
