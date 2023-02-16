package y23.m02.d16;

public class Mitarbeiter {
    
    // Variablen für den Konstruktor
    private String name;
    private double gehalt;
    
    // Konstruktor um einen Mitarbeiter zu erstellen
    public Mitarbeiter(String name, double gehalt) {
        this.name = name;
        this.gehalt = gehalt;
    }
    
    // Gibt den Namen + Gehalt eines Mitarbeiters aus
    public void ausgeben() {
        System.out.println(name + " " + gehalt);
    }

}