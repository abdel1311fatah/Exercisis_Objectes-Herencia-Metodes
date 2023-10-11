
package exercisi1;


public class Exercisi1 {

    
    public static final void main (String[] args) 
    {                    
        
        ClasseA a = new ClasseA();
        ClasseA b = new ClasseA(20);
        ClasseA c = new ClasseA(20, 40);
        System.out.println("L'objecte _a:_ conté: " + a.getValorPrimari() + ", " + a.getValorSecundari());
        System.out.println("L'objecte _b:_ conté: " + b.getValorPrimari() + ", " + b.getValorSecundari());
        System.out.println("L'objecte _c:_ conté: " + c.getValorPrimari() + ", " + c.getValorSecundari());
        
    }
    
    
    
}