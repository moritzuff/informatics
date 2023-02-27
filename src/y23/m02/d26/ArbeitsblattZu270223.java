package y23.m02.d26;

public class ArbeitsblattZu270223 {
    
    public void arrayEinsBisZwanzig() {
        //leerer Array wird erstellt
        int arr[];
        //Die "Plätze" für den Integer-Array werden festgelegt
        arr = new int[21];
        
        //for-Schleife geht durch alle Elemente des Arrays (null)
        for (int i = 1; i < arr.length; i++) {
            //i ist 1, 2, 3 etc. und wird in den Array an die jeweilige i-te Stelle "gelegt"
            arr[i] = i;
            //Der Array wird vorwärts ausgegeben
            System.out.println("Array vorwärts: " + arr[i]);
        }
        //Platzhalter
        System.out.println("---");
        
        //for-Schleife geht rückwärts durch den Array
        for (int i = arr.length - 1; i >= 0; i--) {
            //Array wird rückwärts ausgegeben
            System.out.println("Array rueckwaerts: " + arr[i]);
        }
    }
    
    public void wetterstation() {
        //Initiliasierung des Arrays
        int temperatur[] = {12,14,9,12,15,16,15,12,11,8,13,13,15,12};
        //Integer für min/max Temperatur
        int min = temperatur[0];
        int max = temperatur[0];
        
        //for-Schleife geht durch den Temperatur Array
        for (int i = 1; i < temperatur.length; i++) {
            //Wenn die aktuelle Temperatur kleiner als die aktuelle min Temp ist, dann wird diese zur min Temp
            if (temperatur[i] < min) {
                min = temperatur[i];
            }
        }
        //Kleinster Wert wird ausgegeben
        System.out.println("Der kleinste Wert ist: " + min);
        
        //for-Schleife geht durch den Temperatur Array
        for (int i = 1; i < temperatur.length; i++) {
            //Wenn die aktuelle Temperatur größer als die aktuelle max Temp ist, dann wird diese zur max Temp
            if (temperatur[i] > max) {
                max = temperatur[i];
            }
        }
        //Größter Wert wird ausgegeben
        System.out.println("Der groeßte Wert ist: " + max);
        
        //Initialisierung von double für tempg(esamt) und den Mittelwert
        double tempg = 0;
        double mittelwert = 0;
        
        for (int i = 0; i < temperatur.length; i++) {
            tempg = tempg + temperatur[i];
            
        }
        mittelwert = tempg / temperatur.length;
        System.out.println("Mittelwert: " + mittelwert);
        
    }
    
    public void mehrdimensionalerArray() {
        int[][] brett = new int[10][10];
        
        //Berechnung
        //y-Position 0-9
        for (int i = 0; i < brett.length; i++) {
            //für jedes y also 0 usw. geht die Schleife 10x durch, insgesamt also 100x im Programm
            for (int j = 0; j < brett[i].length; j++) {
                //i = 0-9 && j = 0-9 || Beispiel: 1*1 = 1 (erste Stelle im gesamten), danach dann 1*2, weil j = 1 + 1, danach dann 1*3, weil j = 2 + 1 --> usw.
                brett[i][j] = (i + 1) * (j + 1);
            }
        }
        //Ausgabe
        //y-Position 0-9
        for (int i = 0; i < brett.length; i++) {
            //für jedes y also 0 usw. geht die Schleife 10x durch, insgesamt also 100x im Programm
            for (int j = 0; j < brett[i].length; j++) {
                //Gebe aus der i-ten Reihe den j-ten Wert aus, erste Reihe = 1
                System.out.print(brett[i][j] + "\t");
            }
            //leere Zeile
            System.out.println();
        }
    }
}

