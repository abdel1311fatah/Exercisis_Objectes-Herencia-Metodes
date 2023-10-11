package practica3b;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Practica3B {

    public static void main(String[] args) {
        Practica3B programa = new Practica3B();
        programa.inici();
    }

    public void inici() {

        Random random = new Random();
        ArrayList<venedor> arrayVenedors = new ArrayList<>();
        for (int c1 = 0; c1 < 5; c1++) {
            String nom = obtindreString("Introdueix el nom del venedor: ");
            String primer_cognom = obtindreString("Introdueix el cognom del venedor ");
            String zona = obtindreString("Introdueix la ciutat on ven el venedor");
            
            double[] imp_vendes = new double[4];

            for (int c2 = 0; c2 < imp_vendes.length; c2++) {
                imp_vendes[c2] = random.nextDouble(101);
            }

            arrayVenedors.add(new venedor(nom, primer_cognom, zona, imp_vendes));

            for (venedor venedorX : arrayVenedors) {
                
                System.out.println("El venedor: " + venedorX.getNom() + " " + venedorX.getPrimer_cognom() + " te la zona " + venedorX.getZona() + " i ha generat aquests ingresos als 4 trimestres: " );
                
                for (int c2 = 0; c2 < venedorX.getImp_vendes().length; c2++) {
                    System.out.print(venedorX.getImp_vendes()[c2]);
                }
                
                System.out.println("La mitja dels trimestres es: " + venedorX.mitjana(imp_vendes));
                System.out.println("Les dades del seguent venedor son: ");
            }

        }

    }

    public String obtindreString(String text) {
        Scanner sc = new Scanner(System.in);

        System.out.print(text);
        String text_usuari = sc.nextLine();

        return text_usuari;
    }

}
