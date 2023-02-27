package y23.m02.d27;


    public class Fachbereich {
        private String namen;
        private int nummer;
        public  Vorlesungen[] vorlesungen;


        @Override
        public String toString() {
            return "Fachbereich{" +
                    "namen='" + namen + '\'' +
                    ", nummer=" + nummer +
                    ", vorlesungen1=" + vorlesungen[0] +
                    ", vorlesungen2=" + vorlesungen[1] +
                    ", vorlesungen3=" + vorlesungen[2] +
                    ", vorlesungen4=" + vorlesungen[3] +


                    '}';
        }


        public Fachbereich(String namen, int nummer){
            this.namen=namen;
            this.nummer=nummer;
            this.vorlesungen=new Vorlesungen[4];
            vorlesungen[0]=new Vorlesungen("hallo","233kdkkd");
            vorlesungen[1]=new Vorlesungen("hallo123","342kkdk");


        }

        public int getNummer() {
            return nummer;
        }

        public void setNamen(String namen) {
            this.namen = namen;
        }

        public String getNamen() {
            return namen;
        }

        public void setNummer(int nummer) {
            this.nummer = nummer;
        }


        public static Vorlesungen erstelleVorlesung(){
         return new Vorlesungen();


        }

        //public void setVorlesungen(Vorlesungen[] Vorlesungen){ ???
       //     this.vorlesungen=Vorlesungen;???


            ///nacher in Uni ist gleich main

            //Hausaufgabe von anderen Uni Verwaltung mit 2 FB mit je 4 Vorlesungen. Diese sollen auch erzeugt werden
            // Fachberech hatt eine Methode umm Vorlesungen hinzuzufü+gen // Univ Verwaltung hat Methode um Fachbereich hinzuzufügen
        }



