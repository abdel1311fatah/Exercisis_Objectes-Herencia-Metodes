//Abel Ibarra
package examen7a.pkg2022.pkg2023;

import java.util.Scanner;


public class Examen7A20222023 {

    
    public static void main(String[] args) {
        Examen7A20222023 programa = new Examen7A20222023();
        programa.inici();
    }
    public void inici(){
        Scanner sc = new Scanner(System.in);
      String nom_treballador = "";
        String data_naixement = "";
        int hores = 0;
        char torn = 'm';
        
        Treballador A = new Treballador(nom_treballador, data_naixement, hores, torn);
        nom_treballador = obtindreString("Escriu el nom de la persona: ");
        data_naixement = obtindreString("Escriu la data de naixement: ");
        hores = obtindreInt("Introdueix les hores: ");
        if (A.comprobarHores(hores) == false){
            System.out.println("No has introduit be les hores");
        }
        System.out.println("Introdueix el torn: ");
        torn = sc.next().charAt(0);
        if (A.comprobarTorn(torn) == false){
            System.out.println("No has introduit be el torn");
        }
        
        System.out.println("Les dades del treballador son: " + nom_treballador +" - " + data_naixement +" - " + hores +" - " + torn);
        System.out.println("El seu salari brut es: " + A.salariBrut(hores, torn));
        System.out.println("El seu salari net es: " + A.salariNet(A.salariBrut(hores, torn)));
    } 
    
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
