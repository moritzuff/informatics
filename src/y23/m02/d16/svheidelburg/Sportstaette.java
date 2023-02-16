package y23.m02.d16.svheidelburg;

public abstract class Sportstaette {
    
    protected double grundgebuehr;

    public Sportstaette(double grundgebuehr) {
        this.grundgebuehr = grundgebuehr;
    }
    
    public double gibGrundgebuehr() {
        return this.grundgebuehr;
    }
    
    public abstract double gibGesamtgebuehr();
    
    
}

    


