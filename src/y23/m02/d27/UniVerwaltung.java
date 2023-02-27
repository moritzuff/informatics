package y23.m02.d27;

public class UniVerwaltung {
    private Fachbereich[] fachbereiche;



    public UniVerwaltung(){
        this.fachbereiche=new Fachbereich[2];
    fachbereiche[0]=new Fachbereich("germanistik",23);
    fachbereiche[1]=new Fachbereich("Mathe",24);




    }


    public Fachbereich[] getFachbereiche() {
        return fachbereiche;
    }

    public void setFachbereiche(Fachbereich[] fachbereiche) {
        this.fachbereiche = fachbereiche;
    }

    public String toString(){
        return ", UniVerwaltung{ "+
                "fachbereich1= " +fachbereiche[0] + '\'' +
                "fachbereich2= "+fachbereiche[1];
    }
   // public void nimmFachbereich(Fachbereich fachbereich1,Fachbereich fachbereich2){
    //    this.fachbereich1=fachbereich1;
      //  this.fachbereich2=fachbereich2;

//    }
    public static void main(String [] args){



        UniVerwaltung muenster=new UniVerwaltung();
        muenster.fachbereiche[0].setNummer(22);
        muenster.fachbereiche[0].setNummer(26);
        muenster.fachbereiche[0].vorlesungen[2]= Fachbereich.erstelleVorlesung();
        muenster.fachbereiche[0].vorlesungen[2].setTitle("Klappt das?");
        muenster.fachbereiche[0].vorlesungen[2].setNummer("JA???");


        muenster.fachbereiche[1].vorlesungen[3]= Fachbereich.erstelleVorlesung();
        muenster.fachbereiche[1].vorlesungen[3].setNummer("Es klappt");
        muenster.fachbereiche[1].vorlesungen[3].setTitle("Ja es klappt");





     //  vorlesungen[2]=erstelleVorlesung();
     //  Vorlesungen vorlesungen4=erstelleVorlesung();

      //  fachbereich1.nimmVorlesungen(vorlesungen3,vorlesungen4);
       // fachbereich2.nimmVorlesungen(vorlesungen3,vorlesungen4);

      // vorlesungen3.setNummer("jaaaa");
    //   vorlesungen3.setTitle("neinn");

     //  vorlesungen4.setNummer("keineAhnunnng");
      // vorlesungen4.setTitle("ichweißesNicht");

      ///  muenster.nimmFachbereich(fachbereich1,fachbereich2);

       System.out.print(muenster);


       // Vorlesungen[] v1= new Vorlesungen[2];
      //  v1[0]=vorlesungen3;

      //  v1[0]=vorlesungen4;
       // v1[0].setTitle("hallo");

      //  Vorlesungen[] h= {vorlesungen3};

      //  Fachbereich[] fach= new Fachbereich[2];
     //   fach[0]=fachbereich1;
      //  fach[1]=fachbereich2;



    }

 //   private static Vorlesungen erstelleVorlesung() {
    //    return new Vorlesungen();
 //  }
}
