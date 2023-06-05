

public class calculadora {

    public static void main(String[] args) {

    }


    public static void Tests() {
        testSuma();
        testResta();
        testMultiplicacion();
        testDivision();
        //testRaiz();
        //testPotencia();
    }

    public static void testSuma() {
        assert suma(2.5, 3.7) == 6.2;
        assert suma(-5.9, 10.3) == 4.4;
        assert suma(0, 0) == 0;
    }
    
    public static void testResta() {
        assert resta(5.6, 3.2) == 2.4;
        assert resta(10.8, -5.4) == 16.2;
        assert resta(0, 0) == 0;
    }

    public static void testMultiplicacion() {
        assert multiplicacion(2.5, 3.2) == 8.0;
        assert multiplicacion(-5.5, 10.0) == -55.0;
        assert multiplicacion(0, 5.7) == 0;
    }

    public static void testDivision() {
        assert division(10.5, 2.0) == 5.25;
        assert division(-50.0, 10.0) == -5.0;
        boolean caughtException = false;
        try {
            division(7.0, 0.0);
        } catch (IllegalArgumentException e) {
            caughtException = true;
        }
        assert caughtException;
    }


/*    public static void testRaiz() {

    }

    public static void testPotencia() {

    }
    */
}