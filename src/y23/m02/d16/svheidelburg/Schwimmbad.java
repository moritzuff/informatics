package y23.m02.d16.svheidelburg;

public class Schwimmbad extends Sportstaette {
    
    private double prozentAufschlag;

    public Schwimmbad(double grundgebuehr, double prozentAufschlag) {
        super(grundgebuehr);
        this.prozentAufschlag = prozentAufschlag;
    }

    @Override
    public double gibGesamtgebuehr() {
        double aufschlag = grundgebuehr * prozentAufschlag;
        double neuGesamt = grundgebuehr + aufschlag;
        return neuGesamt;
    }
    
    
}
