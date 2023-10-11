package practica3b;

import java.util.Random;

public class venedor {

    private String nom;
    private String primer_cognom;
    private String zona;
    private double[] imp_vendes = new double[4];

    public venedor(String nom, String primer_cognom, String zona, double[] imp_vendes) {

        this.nom = nom;
        this.primer_cognom = primer_cognom;
        this.zona = zona;
        this.imp_vendes = imp_vendes;

    }

    public double mitjana (double [] imp_vendes){
        double mitjana = 0;
        int c2 = 0;
        for (int c1 = 0; c1 < 4;c1++){
            mitjana += imp_vendes[c1];
            c2 = c1;
        }
        mitjana = mitjana / (c2+1);
        return mitjana;
        
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrimer_cognom() {
        return primer_cognom;
    }

    public void setPrimer_cognom(String primer_cognom) {
        this.primer_cognom = primer_cognom;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double[] getImp_vendes() {
        return imp_vendes;
    }

    public void setImp_vendes(double[] imp_vendes) {
        this.imp_vendes = imp_vendes;
    }

}
