
package com.mycompany.exercisi_joc1;

import java.util.Random;


public class Exercisi_Joc1 {
    
Random r = new Random( );
    public static void main(String[] args) {
        Exercisi_Joc1 p = new Exercisi_Joc1();
        p.principal();
    }
    
    public void principal (){
        int gp = 0; //No guanyat o perdut, gp = 1 guanyar i gp = 2 perdre
        int primer = 0, c1 = 0, d1 = 0, d2 = 0, total = 0;
        do{
            int dos_daus = tirar_daus();
            if (c1 == 1){
                gp = primera_tirada(dos_daus);    
            }else{
                gp = altres_tirada(primer,dos_daus); 
            }
        }while(gp = 0);
    }
    
    public int tirar_daus(){
        Random r = new Random( );
        d1= r.nextInt(6)+1;        
        d2= r.nextInt(6)+1;
        total = d1 + d2;
    }
}
