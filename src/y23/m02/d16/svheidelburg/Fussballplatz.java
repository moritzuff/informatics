package y23.m02.d16.svheidelburg;

public class Fussballplatz extends Sportstaette {
    
    private int anzahlTrainingseinheiten;
    private double gebuehrProTrainingseinheit;

    public Fussballplatz(double grundgebuehr, int anzahlTrainingseinheiten, double gebuehrProTrainingseinheit) {
        super(grundgebuehr);
    }

    @Override
    public double gibGesamtgebuehr() {
        return grundgebuehr + anzahlTrainingseinheiten * gebuehrProTrainingseinheit;
    }
    
}
