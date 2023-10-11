package aplication2b_objetos;

import java.util.Scanner;

public class Aplication2B_objetos {

    public static void main(String[] args) {
        Aplication2B_objetos programa = new Aplication2B_objetos();
        programa.inici();
    }
    
    public void inici(){
        Scanner lector = new Scanner(System.in);
        
        // Solicitar los datos de la persona al usuario
        String nom = obtindreString("Escriu el nom de la persona: ");
        int edat = obtindreInt("Introdueix la edat: ");
        System.out.println("Introdueix el sexe: ");
        char sexe = lector.next().charAt(0);
        double peso = obtindreDouble("Introdueix el pes: ");
        double altura = obtindreDouble("Introdueix l'altura: ");
        
        // Crear un objeto Persona con los datos proporcionados
        Persona P1 = new Persona(nom, edat, sexe, peso, altura);
        
        // Calcular el índice de masa corporal (IMC) de la persona
        double IMC = P1.calcularIMC(P1.getPeso(), P1.getAltura());
        
        // Mostrar el resultado del cálculo del IMC y el estado de peso de la persona
        System.out.println("El IMC = " + P1.calcularIMC(P1.getPeso(), P1.getAltura()));
        if (IMC == -1){
            System.out.println("La persona esta per abaix del seu pes ideal");
        } else if (IMC == 0){
            System.out.println("La persona esta al seu pes ideal");
        } else if (IMC == 1){
            System.out.println("La persona esta per sobre del seu pes ideal");
        }
        
        if (P1.esMayorDeEdat(edat) == false){
            System.out.println("Es mayor de edat");
        }else{
            System.out.println("No es mayor de edat");
        }
        // Mostrar la edad de la persona y si es mayor de edad
        System.out.println("La edat es: " + P1.getEdat());
        if (edat >= 18){
            System.out.println("Es major d'edat");
        } else {
            System.out.println(edat);
            System.out.println("No es major d'edat");
        }
        
        // Mostrar el sexo, peso y altura de la persona
        System.out.println("El sexe es: " + P1.getSexe());
        System.out.println("El pes es: " +  P1.getPeso());
        System.out.println("L'altura es: " + P1.getAltura());
    }
    
    // Método para obtener un entero del usuario
    public int obtindreInt(String text) {
        boolean TipusCorrecte;
        Scanner sc = new Scanner(System.in);
        int num_usuari = 0;

        do {
            System.out.print(text);
            TipusCorrecte = sc.hasNextInt();
            if (!TipusCorrecte) {
                sc.nextLine();
                System.out.println("Error: Valor no válido");
            } else {
                num_usuari = sc.nextInt();
            }
        } while (!TipusCorrecte);
        
        return num_usuari;
    }
    
     public double obtindreDouble(String text) {
        boolean TipusCorrecte;
        Scanner sc = new Scanner(System.in);
        double num_usuari = 0.0;

        do {
            System.out.print(text);
            TipusCorrecte = sc.hasNextDouble();
            if (!TipusCorrecte) {
                sc.nextLine();
                System.out.println("Error Valor no valid");
            } else {
                num_usuari = sc.nextDouble();
            }
        } while (!TipusCorrecte);
        return num_usuari;
    }

    // Método para obtener una cadena de texto del usuario
    public String obtindreString(String text) {
        Scanner sc = new Scanner(System.in);

        System.out.print(text);
        String text_usuari = sc.nextLine();
        
        return text_usuari;
    }
}
