package informatics;

import y23.m12.d05.Queue;

public class Informatics {
        
    public static int laenge = 12;
    
    public static void main(String[] args) {
        for (int i = 0; i <= laenge; i++) {
            System.out.println("");
            for (int j = laenge-i; j < laenge; j++) {
                System.out.printf("%-3s", "*");
            }
        }
        
    }

}