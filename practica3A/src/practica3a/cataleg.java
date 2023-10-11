package practica3a;

public class cataleg {

    private int identif;
    private String titol;
    private String autor;
    private String edit;
    private double preu;

    public cataleg(int identif, String titol, String autor, String edit, double preu) {

        this.identif = identif;
        this.titol = titol;
        this.autor = autor;
        this.edit = edit;
        this.preu = preu;

    }

    public boolean buscar(String autor) {
        return this.autor.equals(autor);
    }

    public int getIdentif() {
        return identif;
    }

    public void setIdentif(int identif) {
        this.identif = identif;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "cataleg{" + "identif=" + identif + ", titol=" + titol + ", autor=" + autor + ", edit=" + edit + ", preu=" + preu + '}';
    }

}
