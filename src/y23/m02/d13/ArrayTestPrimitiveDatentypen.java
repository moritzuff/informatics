package y23.m02.d13;

public class ArrayTestPrimitiveDatentypen {

    // Deklarieren Sie hier einen neuen Array a des Typs int mit der Laenge 6 (keine Listeninitialisierung)
    int[] a = new int[5];

    // Deklarieren Sie hier einen neuen Array b des Typs double mit der Laenge 4 (Listeninitialisierung mit 0.4, 0.32, 0.45, 0.25)
    double[] b = {0.4, 0.32, 0.45, 0.25};

    public ArrayTestPrimitiveDatentypen() {

        // Geben Sie von a und b das Element mit Index 0 ueber die Systemausgabe aus!
        System.out.println("a[0] = " + a[0]);
        System.out.println("b[0] = " + b[0]);

        // Weisen Sie dem Element mit Index 0 des Arrays a den Wert 199 zu
        a[0] = 199;

        // Weisen Sie dem Element mit Index 1 des Arrays a den Wert 46 zu
        a[1] = 46;

        // Weisen Sie dem Element mit Index 2 des Arrays a den Wert 199 zu
        a[2] = 199;
        
        // Überprüfen Sie ob Ihre Bedingung funktioniert, indem Sie vorher dem Element mit Index 3 des Arrays a einen anderen Wert als 0 zuweisen
        // --> a[3] = 69;
        
        // Prüfen Sie mittels if Bedingung, ob das Element mit Index 3 des Arrays a gleich 0 ist.
        
        if (a[3] == 0) {
            // Ist dies der Fall so soll ausgegeben werden: "Der Wert des Element mit Index 3 ist nicht initialisiert worden"
            System.out.println("Der Wert des Element mit Index 3 ist nicht initialisiert worden");
        // Ansonsten soll der Wert ausgegeben werden.    
        } else {
            System.out.println("a[3] = " + a[3]);
        }
        
        // Programmieren Sie mittels einer for-Schleife eine Ausgabe aller Elemente der Arrays a
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = "+ a[i]);
        }
        
        // Programmieren Sie mittels einer for-Schleife eine Ausgabe aller Elemente der Arrays b
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
        
        int i = 0;
        
        while (i < b.length) {
            System.out.println(b[i]);
            i++;
        }
    }

    

}
