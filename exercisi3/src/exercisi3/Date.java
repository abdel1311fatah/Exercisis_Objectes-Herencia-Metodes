package exercisi3;

import java.time.LocalDate;

public class Date {
    
    private int dia;
    private int mes;
    private int any;
    
    public Date (int dia, int mes, int any) {

        LocalDate data = LocalDate.of(any, mes, dia);
        if (!data.equals(LocalDate.of(any, mes, dia))) {
            System.out.println("La data no es valida");  
        }
        this.dia = dia;
        this.mes = mes;
        this.any = any;

    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
  
}




