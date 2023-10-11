package aplicacion2a_objetos;
import java.util.Scanner;
public class Aplicacion2A_objetos {
    
    public static void main(String[] args) {
        
        Aplicacion2A_objetos programa = new Aplicacion2A_objetos();
        programa.inici();
       
    }
    public void inici(){
        
       double cantidad = obtindreDouble("Escriu la quantitat ");
       double precio = obtindreDouble("Escriu el preu ");
       
       facturar factura = new facturar(cantidad, precio);
       
        System.out.println("El total a pagar es: " + factura.calcularVenta(cantidad, precio));
       
    }
    
     public double obtindreDouble(String text) {
        boolean TipusCorrecte;
        Scanner sc = new Scanner(System.in);
        int num_usuari = 0;

        do {
            System.out.print(text);
            TipusCorrecte = sc.hasNextDouble();
            if (!TipusCorrecte) {
                sc.nextLine();
                System.out.println("Error Valor no valid");
            } else {
                num_usuari = sc.nextInt();
            }
        } while (!TipusCorrecte);
        return num_usuari;
    }
     
}
        
 
