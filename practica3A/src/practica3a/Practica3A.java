package practica3a;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica3A {

    public static void main(String[] args) {
        Practica3A programa = new Practica3A();
        programa.inici();
    }

    public void inici() {
        
        ArrayList<cataleg> arrayLlibres = new ArrayList<>();

        arrayLlibres.add(new cataleg(1, "as", "buscar", "asd", 19.99));
        arrayLlibres.add(new cataleg(2, "asa", "dassas", "asasdd", 18.99));
        arrayLlibres.add(new cataleg(3, "adss", "daasds", "asdds", 39.99));
        arrayLlibres.add(new cataleg(4, "assa", "dassads", "asdsadd", 48.99));
        arrayLlibres.add(new cataleg(5, "asssdsfda", "dassa34ds", "asd55sadd", 49.99));

        String buscat = obtindreString("Introdueix l'autor del llibre que vols buscar: ");
        cataleg llibreTrobat1 = null;
        boolean llibreTrobat = false;

        for (cataleg llibre : arrayLlibres) {
            System.out.println("Les dades del llibre " + llibre.getIdentif() + " són: ");
            System.out.println(llibre);
            System.out.println("---------------------------------");

            if (llibre.buscar(buscat) == true) {
                llibreTrobat = true;
                llibreTrobat1 = llibre;
            }
        }
        if (llibreTrobat == true) {
            System.out.println("El llibre que busques és: " + llibreTrobat1);
        } else {
            System.out.println("No s'ha trobat cap llibre amb aquest autor.");
        }
    }

    public String obtindreString(String text) {
        Scanner sc = new Scanner(System.in);

        System.out.print(text);
        String text_usuari = sc.nextLine();

        return text_usuari;
    }

}
