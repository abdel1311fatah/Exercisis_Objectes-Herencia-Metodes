package practica4a;

import java.util.Objects;

public class Fitxa {

    protected String referencia;
    protected String titol;

    public Fitxa(String referencia, String titol) {
        this.referencia = referencia;
        this.titol = titol;
    }

    public void Visualitzar() {

        String fitxa = "La referencia es: " + this.referencia + " i el titol es: " + this.titol;
        System.out.println(fitxa);
        
    }

    @Override
    public String toString() {
        return "Fitxa{" + "referencia=" + referencia + ", titol=" + titol + '}';
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fitxa other = (Fitxa) obj;
        if (!Objects.equals(this.referencia, other.referencia)) {
            return false;
        }
        return Objects.equals(this.titol, other.titol);
    }
    
    
}