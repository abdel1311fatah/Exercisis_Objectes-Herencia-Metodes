package practica4a;

public class Obra extends Fitxa {

    protected short nrePags;
    protected String autor;

    public Obra(String autor, String referencia, int nrePags1, String titol) {
        super(referencia, titol);
        this.nrePags = nrePags;
        this.autor = autor;
    }

    public void Visualitzar() {
        
        super.Visualitzar();
        String fitxa = "L autor es: " + this.autor + " i el numero de pagines es: " + this.nrePags;
        System.out.println(fitxa);

    }

}
