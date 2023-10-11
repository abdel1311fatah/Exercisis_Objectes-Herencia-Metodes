package aplication2b_objetos;

public class Persona {
    private String nombre;
    private int edat;
    private char sexe;
    private double peso;
    private double altura;
    
    // Constructor por defecto
    public Persona(){
        this.nombre = "";
        this.edat = 0;
        this.sexe = comprobarSexo(sexe);
        this.peso = 0;
        this.altura = 0;
    }
    
    // Constructor con nombre, edad y sexo como parámetros
    public Persona(String nombre, int edat, char sexe) {
        this.nombre = nombre;
        this.edat = edat;
        this.sexe = comprobarSexo(sexe);
        this.peso = 0;
        this.altura = 0;
    }
    
    // Constructor con todos los parámetros
    public Persona(String nombre, int edat, char sexe, double peso, double altura) {
        this.nombre = nombre;
        this.edat = edat;
        this.sexe = comprobarSexo(sexe);
        this.peso = peso;
        this.altura = altura;
    }
    
    // Método para calcular el índice de masa corporal (IMC)
    public double calcularIMC (double peso, double altura){
        double IMC = (peso / (altura * altura));
        
        if (IMC < 18.5){
            IMC = -1;
        } else if(IMC <= 24.9){
            IMC = 0;
        } else if(IMC <= 29.9){
            IMC = 1;
        }
        
        return IMC;
    }
    
    // Método para comprobar si la persona es mayor de edad
    public boolean esMayorDeEdat(int edat){
        boolean esMayorDeEdat = true;
        
        if (edat <= 18){
            esMayorDeEdat = false;
        }
        
        return esMayorDeEdat;
    }
    
    // Método privado para comprobar y normalizar el sexo
    private char comprobarSexo(char sexe){
        if (((sexe == 'H') || (sexe == 'M')) || (sexe == 'h') || (sexe == 'm')){
            sexe = sexe;
        } else {
            sexe = 'H';
        }
        
        return sexe;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edat=" + edat + ", sexe=" + sexe + ", peso=" + peso + ", altura=" + altura + '}';
    }

    // Métodos getter y setter para acceder y modificar las variables de instancia
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
