package practica4a;

public class Revista extends Fitxa {

    private int any;
    private int nro;

    public Revista(int any, int nro, String referencia, String titol) {
        
        super(referencia, titol);
        this.any = any;
        this.nro = nro;
        
    }

    public void Visualitzar() {

        super.Visualitzar();
        String fitxa = "El numero de revista es: " + this.nro + " i l any es: " + this.any;
        System.out.println(fitxa);

    }

}
