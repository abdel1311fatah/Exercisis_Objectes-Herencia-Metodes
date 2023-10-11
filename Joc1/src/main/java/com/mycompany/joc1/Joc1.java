
package com.mycompany.joc1;
import java.util.Random;
public class Joc1 {

    public static void main(String[] args) {
        
        int d1 = 0, d2 = 0, tirades = 0, primer = 0, total = 0, ultim_dau1 = 0, ultim_dau2 = 0, ultim_total = 0;
        boolean guanyat = false, perdut = false;
        Random r = new Random( );
        do{
            
            d1= r.nextInt(6)+1;        
            d2= r.nextInt(6)+1;
            total = d1 + d2;
            tirades++;
            if((tirades == 1)&&((total >=4)||(total<=10) && (total != 12))){
                primer = total;
            }
            if((tirades == 1) && ((total == 7) || (total == 11) || ((tirades != 1) && ((primer == total) && ((total != 7) || (total != 11)))))&&(perdut == false)){ // guanyar
                guanyat = true;
                /*ultim_dau1= d1;
                ultim_dau2= d2;
                ultim_total = total;
                break;*/
            }else if (((tirades == 1)&& ((total == 2) || (total == 3)) || (total == 12)) || (((tirades != 1) && (total == 7) || (total == 11))) && (guanyat == false)){ // perdre
                perdut = true;
                /*ultim_dau1= d1;
                ultim_dau2= d2;
                ultim_total = total;
                break;*/
            }
            System.out.println("Dau 1: " + d1);
            System.out.println("Dau 2: " + d2);
            System.out.println("Total: " + total);
           
        }while((guanyat == false)||(perdut == false));
        /*System.out.println("\n");
        System.out.println("Resultat de la ultima tirada: ");
        System.out.println("Dau 1: " + ultim_dau1);
        System.out.println("Dau 2: " + ultim_dau2);
        System.out.println("Total: " + ultim_total + "\n");*/
        if(guanyat == true){
            System.out.println("Has guanyat");
        }else if(perdut == true){
            System.out.println("Has perdut");
        }
        System.out.println("La partida ha durat "+tirades+" tirades");
    }
}