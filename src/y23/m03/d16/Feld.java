package y23.m03.d16;

public class Feld {
    
    private String name;
    private String feldID;

    public Feld(String name, String feldID) {
        this.name = name;
        this.feldID = feldID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeldID() {
        return feldID;
    }

    public void setFeldID(String feldID) {
        this.feldID = feldID;
    }

    @Override
    public String toString() {
        return "Feld{" + "name=" + name + ", feldID=" + feldID + '}';
    }
    
    

}
