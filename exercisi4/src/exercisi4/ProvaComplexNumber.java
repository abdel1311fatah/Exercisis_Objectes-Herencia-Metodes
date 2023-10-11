package exercisi4;

public class ProvaComplexNumber {

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber c2 = new ComplexNumber(2.0, -3.0);

        ComplexNumber zero = ComplexNumber.ZERO;

        System.out.println("Hem creat el Nombre Complex  c1:");
        System.out.println("\t Part real = " + c1.getReal());
        System.out.println("\t Part imaginària = " + c1.getImaginary());

        System.out.println("\nHem creat el Nombre Complex c2:");
        System.out.println("\t Part real = " + c2.getReal());
        System.out.println("\t Part imaginària = " + c2.getImaginary());

        System.out.println("\nOperació de suma (C1 + ZERO):");
        ComplexNumber res = c1.add(ComplexNumber.ZERO);
        System.out.println("\t Part real = " + res.getReal());
        System.out.println("\t Part imaginària = " + res.getImaginary());

        System.out.println("\nOperació de suma (C1 + C2):");
        res = c1.add(c2);
        System.out.println("\t Part real = " + res.getReal());
        System.out.println("\t Part imaginària = " + res.getImaginary());

        System.out.println("\nDarrera suma duta a terme: ");
        System.out.print("(" + c1 + ") + (" + c2 + ") = (" + res + ")");

        ComplexNumber res1 = c1.rest(ComplexNumber.ZERO);
        res1.rest(c2);

        System.out.println("\nDarrera resta duta a terme: ");
        System.out.print("(" + c1 + ") - (" + c2 + ") = (" + res1 + ")");
        System.out.println("\nDarrera multiplicacio duta a terme: ");

        ComplexNumber res2 = c1.multiply(ComplexNumber.ZERO);
        res2.multiply(c2);

        System.out.print("(" + c1 + ") * (" + c2 + ") = (" + res2 + ")");
    }
}
