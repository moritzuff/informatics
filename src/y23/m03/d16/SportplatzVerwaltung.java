package y23.m03.d16;

public class SportplatzVerwaltung {
    
    private Sportplatz[] sportplaetze;

    public SportplatzVerwaltung() {
        sportplaetze = new Sportplatz[2];
        sportplaetze[0] = new Sportplatz("Heek", "adresse", "sportplatzID");
        sportplaetze[1] = new Sportplatz("Nienborg", "adresse", "sportplatzID");
    }

    public Sportplatz getSportplatz(int id) {
        return sportplaetze[id];
    }
    
    public void setSportplatz(int i, Sportplatz sportplatz) {
        sportplaetze[i] = sportplatz;
    }

}
