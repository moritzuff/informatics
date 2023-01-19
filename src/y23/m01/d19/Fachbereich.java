package y23.m01.d19;

public class Fachbereich {
    
    private String fachbereichName;
    private int fachbereichAnzahlVorlesungen, fachbereichNummer;
    
    private Vorlesung vorlesung;

    public Fachbereich(String fachbereichName, int fachbereichAnzahlVorlesungen, int fachbereichNummer) {
        this.fachbereichName = fachbereichName;
        this.fachbereichAnzahlVorlesungen = fachbereichAnzahlVorlesungen;
        this.fachbereichNummer = fachbereichNummer;
        this.vorlesung = new Vorlesung(fachbereichNummer, fachbereichName);
    }

    public String getFachbereichName() {
        return fachbereichName;
    }

    public void setFachbereichName(String fachbereichName) {
        this.fachbereichName = fachbereichName;
    }

    public int getFachbereichAnzahlVorlesungen() {
        return fachbereichAnzahlVorlesungen;
    }

    public void setFachbereichAnzahlVorlesungen(int fachbereichAnzahlVorlesungen) {
        this.fachbereichAnzahlVorlesungen = fachbereichAnzahlVorlesungen;
    }

    public int getFachbereichNummer() {
        return fachbereichNummer;
    }

    public void setFachbereichNummer(int fachbereichNummer) {
        this.fachbereichNummer = fachbereichNummer;
    }

    @Override
    public String toString() {
        return "Fachbereich{" + "fachbereichName=" + fachbereichName + ", fachbereichAnzahlVorlesungen=" + fachbereichAnzahlVorlesungen + ", fachbereichNummer=" + fachbereichNummer + ", vorlesung=" + vorlesung + '}';
    }
    
    
    
}
