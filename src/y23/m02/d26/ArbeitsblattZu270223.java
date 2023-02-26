package y23.m02.d26;

import jdk.jfr.snippets.Snippets;

public class ArbeitsblattZu270223 {
    
    public void arrayEinsBisZwanzig() {
        int arr[];
        arr = new int[21];
        
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            System.out.println("Array vorwärts: " + arr[i]);
        }
        
        System.out.println("---");
        
        for (int i = 20; i > 0; i--) {
            System.out.println("Array rueckwaerts: " + arr[i]);
        }
    }
    
    public void wetterstation() {
        int temperatur[] = {12,14,9,12,15,16,15,12,11,8,13,13,15,12};
        int min = temperatur[0];
        int max = temperatur[0];
        
        for (int i = 1; i < temperatur.length; i++) {
            
            if (temperatur[i] < min) {
                min = temperatur[i];
            }
        }
        System.out.println("Der kleinste Wert ist: " + min);
        
        for (int i = 1; i < temperatur.length; i++) {
            
            if (temperatur[i] > max) {
                max = temperatur[i];
            }
        }
        System.out.println("Der groeßte Wert ist: " + max);
        
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
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                brett[i][j] = (i + 1) * (j + 1);
            }
        }
        
        //Ausgabe
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                System.out.print(brett[i][j] + " ");
            }
            System.out.println();
        }
    }
}

