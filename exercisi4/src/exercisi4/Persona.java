
package exercisi4;

public class Persona {
    private String nombre;
    private int edat;
    private char sexe;
    private float peso;
    private float altura;
    
    public Persona(){
        
        this.nombre = "";
        this.edat = 0;
        this.sexe = comprobarSexo(sexe);
        this.peso = 0;
        this.altura = 0;
        
    }
    
    public Persona(String nombre, int edat, char sexe) {
        
        this.nombre = nombre;
        this.edat = edat;
        this.sexe = comprobarSexo(sexe);
        this.peso = 0;
        this.altura = 0;
        
    }
    
    public Persona(String nombre, int edat, char sexe, float peso, float altura) {
        
        this.nombre = nombre;
        this.edat = edat;
        this.sexe = comprobarSexo(sexe);
        this.peso = peso;
        this.altura = altura;
    }
    
    public float calcularIMC (float peso, float altura){
        
        float IMC = (peso/(altura*2));
        
        if (IMC < 18.5){
            IMC = -1;
        }else if(IMC <= 24.9){
            IMC = 0;
        }else if(IMC <= 29.9){
            IMC = 1;
        }
        
        return IMC;
        
    }
    
    public boolean esMayorDeEdat(int edat){
        
        boolean esMayorDeEdat = false;
        if (edat <= 18){
            esMayorDeEdat = true;
        }
        
        return esMayorDeEdat;
        
    }
    
    private char comprobarSexo(char sexe){
        
        if (((sexe == 'H')||(sexe == 'M'))||(sexe == 'h')||(sexe == 'm')){
            this.sexe = sexe;
        }else{
            this.sexe = 'H';
        }
        
        return sexe;
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edat=" + edat + ", sexe=" + sexe + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    
}
