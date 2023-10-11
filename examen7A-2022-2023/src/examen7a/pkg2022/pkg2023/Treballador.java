//Abel Ibarra
package examen7a.pkg2022.pkg2023;

public class Treballador {

    private String nom_treballador;
    private String data_naixement;
    private int hores;
    private char torn;

    public Treballador() {
        this.nom_treballador = "";
        this.data_naixement = "";
        this.hores = 0;
        this.torn = 'm';
    }

    public Treballador(String nom_treballador, String data_naixement, int hores, char torn) {
        this.nom_treballador = nom_treballador;
        this.data_naixement = data_naixement;
        this.hores = hores;
        this.torn = torn;
    }

    public boolean comprobarTorn(char torn) {

        boolean comprobarTorn = false;
        if ((torn == 'm') || (torn == 'M')) {
            comprobarTorn = true;
        } else if ((torn == 't') || (torn == 'T')) {
            comprobarTorn = true;
        } else if ((torn == 'n') || (torn == 'N')) {
            comprobarTorn = true;
        } else {
            comprobarTorn = false;
        }

        return comprobarTorn;
    }

    public boolean comprobarHores(int hores) {
        boolean comprobarHores = false;
        if ((hores > 0) && (hores <= 180)) {
            comprobarHores = true;
        }
        return comprobarHores;
    }

   public double salariBrut(int hores, char torn) {
    double salariBrut = 0;
    if ((torn == 'm') || (torn == 'M')) {
        salariBrut = hores * 10;
    } else if ((torn == 't') || (torn == 'T')) {
        salariBrut = hores * 15;
    } else if ((torn == 'n') || (torn == 'N')) {
        salariBrut = hores * 20;
    } else {
        System.out.println("No has introduit un caracter valid");
    }

    return salariBrut;
}

public double salariNet(double salariBrut) {
    double salariNet = 0;
    if (salariBrut < 1100) {
        salariNet = salariBrut - (salariBrut * 5 / 100);
    } else if ((salariBrut >= 1100) && (salariBrut < 1700)) {
        salariNet = salariBrut - (salariBrut * 10 / 100);
    } else if ((salariBrut >= 1700) && (salariBrut < 2000)) {
        salariNet = salariBrut - (salariBrut * 15 / 100);
    } else if (salariBrut >= 2000) {
        salariNet = salariBrut - (salariBrut * 22 / 100);
    }

    return salariNet;
}


    public String getNom_treballador() {
        return nom_treballador;
    }

    public String getData_naixement() {
        return data_naixement;
    }

    public int getHores() {
        return hores;
    }

    public int getTorn() {
        return torn;
    }

    @Override
    public String toString() {
        return "Treballador{" + "nom_treballador=" + this.nom_treballador + " - data_naixement=" + this.data_naixement + " - hores=" + this.hores + " - torn=" + this.torn + '}';
    }

}
