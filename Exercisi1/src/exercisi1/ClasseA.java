package exercisi1;

public class ClasseA {
    
    private int valorPrimari;
    private int valorSecundari;

    public ClasseA() {
        valorPrimari = 5;
        valorSecundari = 10;
    }

    public ClasseA(int valorPrimari) {
        this.valorPrimari = valorPrimari;
    }

    public ClasseA(int valorPrimari, int valorSecundari) {
        this.valorPrimari = valorPrimari;
        this.valorSecundari = valorSecundari;
    }

    public int getValorPrimari() {
        return valorPrimari;
    }

    public int getValorSecundari() {
        return valorSecundari;
    }
   
}
