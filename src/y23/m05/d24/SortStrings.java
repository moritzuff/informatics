package y23.m05.d24;

public class SortStrings {
    
    public static void sortArrays(Person[] personen) {
        
        //Personen Array zu Strings
        StringBuilder sb = new StringBuilder();
        
        for (Person p : personen) {
            sb.append(p.toString()).append(", ");
        }
        String result = sb.toString();
        
        //Liste: XY, YX, ZY wird geteilt
        String[] namen = result.split(", ");
        
        //String[] wird sortiert
        int n = namen.length;
        for (int i = 1; i < n; i++) {
            String key = namen[i];
            int j = i - 1;
            
            while (j >= 0 && namen[j].compareTo(key) > 0) {
                namen[j + 1] = namen[j];
                j--;
            }
            
            namen[j + 1] = key;
        }
        
        sb.delete(0, sb.length());
        
        for (String s : namen) {
            sb.append(s).append(", ");
        }
        
        String namenResult = sb.toString();
        String[] ausgabe = namenResult.split(", ");
        
        for (String string : ausgabe) {
            System.out.println(string);
        }
        
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Hamann", "Lotte");
        Person p2 = new Person("Bendfeld", "Moritz");
        Person p3 = new Person("Schwering", "Mattis");
        Person p4 = new Person("Bendfeld", "Jonathan");
        Person p5 = new Person("Küper", "Fabian");
        
        Person[] personen = {p1, p2, p3, p4, p5};
        sortArrays(personen);
    }
    
    
}
