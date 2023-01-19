package informatics;

import y22.m12.d01.A4_26;
import y23.m01.d12.A4_35;
import y23.m01.d19.Fachbereich;
import y23.m01.d19.Vorlesung;

public class Informatics {

    public static void main(String[] args) {
        //new A4_26().berechneQuersumme();
        //new A4_35().getWochentag();
        Fachbereich wirtschaftsinformatik = new Fachbereich("wirtschaftsinformatik", 1, 101);
        Vorlesung einfuehrung = new Vorlesung(1, "Einführung in die Informatik", wirtschaftsinformatik);
    }
    
    
}
