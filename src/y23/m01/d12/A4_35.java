package y23.m01.d12;

import java.util.Scanner;

public class A4_35 {
    
    //Variablen werden erstellt
    private int t, m, j;
    private String answer, weekday;
    
    //Get- und Set-Methoden
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
    
    //Methode, die später in der Main-Methode ausgeführt wird
    public void getWochentag() {
        //Scanner wird erstellt
        Scanner scanner = new Scanner(System.in);
        
        //Eingabe des Datums durch den Nutzer
        System.out.println("Tag: ");
        t = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Monat: ");
        m = Integer.parseInt(scanner.nextLine());
        int oldM = m;
        
        System.out.println("Jahr: ");
        j = Integer.parseInt(scanner.nextLine());
        //eingegebenes Jahr wird auf einer neuen Variable gespeichert, 
        //damit in der Antwort nicht die Variable j ausgegeben wird, da diese ja schon verfälscht ist
        int oldJ = j;
        
        //Algorithmus (vorgegeben)
        if (m <= 2) {
            m = m+10;
            j = j-1;
        } else {
            m = m-2;
        }
        
        int c = j/100;
        int y = j % 100;
        int h = (((26 * m - 2) / 10) + t + y + y / 4 + c / 4 - 2 * c) % 7;
        
        if (h < 0) {
            h = h+7;
        }
        
        //Abfrage der Variable h und welchem Wochentag sie entspricht
        switch (h) {
            case 0:
                this.setWeekday("Sonntag");
                break;
            case 1:
                this.setWeekday("Montag");
                break;
            case 2:
                this.setWeekday("Dienstag");
                break;
            case 3:
                this.setWeekday("Mittwoch");
                break;
            case 4:
                this.setWeekday("Donnerstag");
                break;
            case 5:
                this.setWeekday("Freitag");
                break;
            case 6:
                this.setWeekday("Samstag");
                break;
            }
        //Antwort
        answer = "Der " + t + "." + oldM + "." + oldJ + " ist ein " + weekday;
        System.out.println(answer);
}

    
           
}
