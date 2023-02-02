package y23.m01.d26;

public abstract class Super {
    
    protected String x;

    public Super(String x) {
        System.out.println("Super-Konstruktor gestartet.");
        System.out.println("x = " + x);
        x = "nach Super-Konstruktor";
        System.out.println("Super-Konstruktor beendet.");
        System.out.println("x = " + x);
    }

    
}
