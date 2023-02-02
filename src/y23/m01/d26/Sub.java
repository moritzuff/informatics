package y23.m01.d26;

public class Sub extends Super {
    
    private String y = "vor Sub-Konstruktor";

    public Sub(String y, String x) {
        super(x);
        this.y = y;
        System.out.println("Sub-Konstruktor gestartet.");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = "nach Sub-Konstruktor";
        y = "nach Sub-Konstruktor";
        System.out.println("Sub-Konstruktor beendet.");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
