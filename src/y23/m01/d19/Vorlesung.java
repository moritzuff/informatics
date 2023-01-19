package y23.m01.d19;

public class Vorlesung {
    private int vorlesungsID;
    private String vorlesungsName;

    public Vorlesung(int vorlesungsID, String vorlesungsName) {
        this.vorlesungsID = vorlesungsID;
        this.vorlesungsName = vorlesungsName;
    }

    public int getVorlesungsID() {
        return vorlesungsID;
    }

    public void setVorlesungsID(int vorlesungsID) {
        this.vorlesungsID = vorlesungsID;
    }

    public String getVorlesungsName() {
        return vorlesungsName;
    }

    public void setVorlesungsName(String vorlesungsName) {
        this.vorlesungsName = vorlesungsName;
    }

    @Override
    public String toString() {
        return "Vorlesung{" + "vorlesungsID=" + vorlesungsID + ", vorlesungsName=" + vorlesungsName + '}';
    }
    
    
}
