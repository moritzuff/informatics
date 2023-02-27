package y23.m02.d27;

public class Vorlesungen {
    private String title;
    private String nummer;

    @Override
    public String toString() {
        return "Vorlesungen{" +
                "title='" + title + '\'' +
                ", nummer='" + nummer + '\'' +
                '}';
    }


    public Vorlesungen(String title, String nummer){
        this.nummer=nummer;
        this.title=title;

    }
    public Vorlesungen(String title){

    }

    public Vorlesungen(){

    }





    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public String getNummer(){
        return nummer;

    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

}
