package y23.m01.d19;

public class Fachbereich {
    
    private String fachbereichName;
    private int fachbereichAnzahlVorlesungen, fachbereichNummer;
    
    private Vorlesung vorlesung;
    private Vorlesung v1;
    private Vorlesung v2;
    
    public Fachbereich(String fachbereichName, int fachbereichAnzahlVorlesungen, int fachbereichNummer) {
        this.fachbereichName = fachbereichName;
        this.fachbereichAnzahlVorlesungen = fachbereichAnzahlVorlesungen;
        this.fachbereichNummer = fachbereichNummer;
        this.vorlesung = new Vorlesung(fachbereichNummer, fachbereichName);
        v1 = new Vorlesung(187, "Strassenbande");
        v2 = new Vorlesung(102, "Boys");
    }

    public Vorlesung getVorlesung() {
        return vorlesung;
    }

    public void setVorlesung(Vorlesung vorlesung) {
        this.vorlesung = vorlesung;
    }

    public Vorlesung getV1() {
        return v1;
    }

    public void setV1(Vorlesung v1) {
        this.v1 = v1;
    }

    public Vorlesung getV2() {
        return v2;
    }

    public void setV2(Vorlesung v2) {
        this.v2 = v2;
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
