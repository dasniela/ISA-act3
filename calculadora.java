import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("CALCULADORA");
        System.out.println("----------");

         // Input numbers from the user
         System.out.print("Elige el primer número: ");
         double num1 = scanner.nextDouble();
 
         System.out.print("Elige el segundo número:  ");
         double num2 = scanner.nextDouble();
        
        while (true) {
            System.out.println("LAS OPCIONES DE LA CALCULADORA SON LAS SIGUIENTES:");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVISION");
            System.out.println("5. RAIZ CUADRADA");
            System.out.println("6. POTENCIA");
            System.out.println("0. SALIR");
            System.out.print("ELIGE LA OPCION QUE DESEES: ");
            
            int opcion = scanner.nextInt();
            
            if (opcion == 0) {
                break;
            }
            
            double resultado;
            
            switch (opcion) {
                case 1:
                    resultado = suma(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = resta(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = multiplicacion(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    resultado = division(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 5:
                   /*  resultado = raiz(scanner);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 6:
                    resultado = potencia(scanner);
                    System.out.println("Resultado: " + resultado);
                    break;
                    */
                default:
                    System.out.println("Opcion invalida, elige una opcion entre el 1-6, Si deseas salir elige 0");
            }
            
            System.out.println();
        }
        
        scanner.close();
        Tests();

    }
   private static double suma(double num1, double num2) {        
        return num1 + num2;
        }
    
    private static double resta (double num1, double num2) {
        return num1 - num2;
    }
    
    private static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    
    private static double division(double num1, double num2) {
        if (num1 == 0) {
            System.out.println("No se puede realizar una division entre cero");
            return Double.NaN;
        }
        return num1 / num2;
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
