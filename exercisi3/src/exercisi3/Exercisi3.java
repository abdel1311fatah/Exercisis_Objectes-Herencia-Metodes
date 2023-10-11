package exercisi3;

import java.util.Scanner;

public class Exercisi3 {
    public static void main(String[] args) {
        Exercisi3 nom = new Exercisi3();
        nom.Principal();
    }
    private void Principal() {
        any();
        int mes = mes();
        dia(mes);
    }
    private int dia(int mes) {
        int[] diafinal31 = {1, 3, 5, 7, 8, 10 ,12};
        int[] diafinal30 = {4, 6, 9, 11};
        int dia = 0;
        boolean valorCorrecte = false;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix un dia:");
        do{
            valorCorrecte = lector.hasNextInt();
            if (valorCorrecte){
                dia = lector.nextInt();
            }
            for(int i = 0; i < diafinal31.length; i++) {
                if (mes  != diafinal31[i]){
                    if(dia <= 0||dia >= 32){
                       valorCorrecte = false; 
                    }
                }
                if (valorCorrecte == false) {
                    System.out.println("Has d'introduir un dia :");
                    lector.nextLine();
                }
                lector.hasNextLine();
            }
            for(int j = 0; j < diafinal30.length; j++) {
                if (mes  == diafinal30[j]){
                    if(dia <= 0||dia >= 31){
                       valorCorrecte = false; 
                    }
                }
                if (valorCorrecte == false) {
                    System.out.println("Has d'introduir un dia :");
                    lector.nextLine();
                }
                lector.hasNextLine();
            }
        }while (valorCorrecte != true);
        valorCorrecte = false;
        return dia;
        
    }
    private int mes() {
        int mes = 0;
        boolean valorCorrecte = false;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix un mes:");
        do{
            valorCorrecte = lector.hasNextInt();
            if (valorCorrecte){
                mes = lector.nextInt();
            }
            if (mes < 1 || mes > 12){
                valorCorrecte = false;
            }
            if (valorCorrecte == false) {
                System.out.println("Has d'introduir un mes correcte:");
                lector.nextLine();
            }
        lector.hasNextLine();
        }while (valorCorrecte != true);
        valorCorrecte = false;
        return mes;
    }
    private int any() {
        int any = 0;
        boolean valorCorrecte = false;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix un any:");
        do{
            valorCorrecte = lector.hasNextInt();
            if (valorCorrecte){
                any = lector.nextInt();
            }
            if (any  <= 0){
                valorCorrecte = false;
            }
            if (valorCorrecte == false) {
                System.out.println("Has d'introduir un any :");
                lector.nextLine();
            }
            lector.hasNextLine();
        }while (valorCorrecte != true);
        valorCorrecte = false;
        return any;
    }
}