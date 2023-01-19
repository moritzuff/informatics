package y23.m01.d12;

import java.util.Scanner;

public class A4_36 {
    
    //Methode, die in der Main-Methode ausgeführt wird
    public void getOstersonntag() {
        //Eingabe des Jahres & Erstellung des Scanners
        System.out.println("Jahr: ");
        Scanner scanner = new Scanner(System.in);
        int j = Integer.parseInt(scanner.nextLine());
        //eingegebenes Jahr wird auf einer neuen Variable gespeichert, 
        //damit in der Antwort nicht die Variable j ausgegeben wird, da diese ja schon verfälscht ist
        int oldJ = j;
        
        //Algorithmus (vorgegeben)
        int a = j % 19, b = j % 4, c = j % 7, m = (8 * (j/100) + 13) / 25 - 2, s = j/100 - j/400 - 2;
        m = (15 + s - m) % 30;
        int n = (6 + s) % 7;
        
        int d = (m + 19 * a) % 30;
        
        if (d == 29) {
            d = 28;       
        } else if (d == 28 && a <= 11) {
            d = 27;
        }
        
        int e = (2 * b + 4 * c + 6 * d + n) % 7;
        
        int tag =  21 + d + e + 1;
        int monat;
        if (tag > 31) {
            tag = tag % 31;
            monat = 4; 
        } else {
            monat = 3;
        }
        
        //Antwort
        System.out.println("Im Jahr " + oldJ + " ist der Ostersonntag am " + tag + "." + monat);
    }

}
