package y23.m03.d16;

public class Sportplatz {
    
    private Feld[] felder;
    private String name;
    private String adresse;
    private String sportplatzID;

    public Sportplatz(String name, String adresse, String sportplatzID) {
        this.name = name;
        this.adresse = adresse;
        this.sportplatzID = sportplatzID;
        this.felder = new Feld[2];
        felder[0] = new Feld("Platzname", "187");
        felder[1] = new Feld("111", "11");
        
    }

    public Feld[] getFelder() {
        return felder;
    }

    public void setFelder(Feld[] felder) {
        this.felder = felder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSportplatzID() {
        return sportplatzID;
    }

    public void setSportplatzID(String sportplatzID) {
        this.sportplatzID = sportplatzID;
    }

    @Override
    public String toString() {
        return "Sportplatz{" + "felder=" + felder + ", name=" + name + ", adresse=" + adresse + ", sportplatzID=" + sportplatzID + '}';
    }
    
    
    
    
}
