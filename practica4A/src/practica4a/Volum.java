package practica4a;

public class Volum extends Obra {

    protected short nro;

    public Volum(String autor, String referencia, int nrePags, String titol, int nro1) {
        super(autor, referencia, nrePags, titol);
        this.nro = nro;
    }

    public void Visualitzar() {

        super.Visualitzar();
        String fitxa = "El numero de revista es: " + this.nro;
        System.out.println(fitxa);

    }

}
