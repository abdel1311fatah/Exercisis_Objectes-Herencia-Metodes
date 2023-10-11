package practica4a;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica4A {

    public static void main(String[] args) {

        Practica4A programa = new Practica4A();
        programa.inici();
    }

    public void inici() {

        System.out.println("1: Insertar revista");
        System.out.println("2: Insertar fitxa");
        System.out.println("3: Insertar obra");
        System.out.println("4: Insertar volum");
        int opcio = obtindreInt("Que vols fer? ");

        if (opcio == 1) {
            
            ArrayList<Revista> arrayRevistes = new ArrayList<>();

            int c1 = 2;

            if (c1 > 0) {
                for (int c2 = 0; c2 < c1; c2++) {

                    int any = obtindreInt("Introdueix l any: ");
                    int nro = obtindreInt("Introdueix el numero del volum: ");
                    String referencia = obtindreString("Introdueix la referencia: ");
                    String titol = obtindreString("Introdueix el titol: ");

                    Revista revista = new Revista(any, nro, referencia, titol);
                    arrayRevistes.add(revista);

                    revista.Visualitzar();

                    System.out.println("Introdueix un altra revista ");

                }
            }

            boolean iguals = arrayRevistes.get(0).equals(arrayRevistes.get(1));
            if (iguals) {
                System.out.println("Les revistes son iguals");
            } else {
                System.out.println("Les revistes no son iguals");
            }
        } else if (opcio == 2) {
            ArrayList<Fitxa> arrayFitxes = new ArrayList<>();

            int c1 = 2;

            if (c1 > 0) {
                for (int c2 = 0; c2 < c1; c2++) {

                    String referencia = obtindreString("Introdueix la referencia: ");
                    String titol = obtindreString("Introdueix el titol: ");

                    Fitxa fitxa = new Fitxa(referencia, titol);
                    arrayFitxes.add(fitxa);

                    fitxa.Visualitzar();

                    System.out.println("Introdueix un altra revista ");

                }
            }

            boolean iguals = arrayFitxes.get(0).equals(arrayFitxes.get(1));
            if (iguals) {
                System.out.println("Les fitxes son iguals");
            } else {
                System.out.println("Les fitxes no son iguals");
            }
        } else if (opcio == 3) {
            ArrayList<Obra> arrayObres = new ArrayList<>();

            int c1 = 2;

            if (c1 > 0) {
                for (int c2 = 0; c2 < c1; c2++) {

                    String referencia = obtindreString("Introdueix la referencia: ");
                    String titol = obtindreString("Introdueix el titol: ");
                    String autor = obtindreString("Introdueix el autor: ");
                    int nrePags = obtindreInt("Introdueix el numero de pagines: ");

                    Obra obra = new Obra(referencia, titol, nrePags, autor);
                    arrayObres.add(obra);

                    obra.Visualitzar();

                    System.out.println("Introdueix un altra revista ");

                }
            }

            boolean iguals = arrayObres.get(0).equals(arrayObres.get(1));
            if (iguals) {
                System.out.println("Les fitxes son iguals");
            } else {
                System.out.println("Les fitxes no son iguals");
            }
        } else if (opcio == 4) {
            ArrayList<Volum> arrayVolums = new ArrayList<>();

            int c1 = 2;

            if (c1 > 0) {
                for (int c2 = 0; c2 < c1; c2++) {

                    String referencia = obtindreString("Introdueix la referencia: ");
                    String titol = obtindreString("Introdueix el titol: ");
                    String autor = obtindreString("Introdueix el autor: ");
                    int nrePags = obtindreInt("Introdueix el numero de pagines: ");
                    int nro = obtindreInt("Introdueix el numero del volum: ");

                    Volum volum = new Volum(referencia, titol, nrePags, autor, nro);
                    arrayVolums.add(volum);

                    volum.Visualitzar();

                    System.out.println("Introdueix un altra revista ");

                }
            }

            boolean iguals = arrayVolums.get(0).equals(arrayVolums.get(1));
            if (iguals) {
                System.out.println("Les fitxes son iguals");
            } else {
                System.out.println("Les fitxes no son iguals");
            }
        }
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

    public String obtindreString(String text) {
        Scanner sc = new Scanner(System.in);

        System.out.print(text);
        String text_usuari = sc.nextLine();

        return text_usuari;
    }

}
