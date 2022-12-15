import java.util.Scanner;

public class MainPunto6 {

    public static void main(String[] args) {

        System.out.println("*****  Punto 6  *****");
        Scanner sc = new Scanner(System.in);
        var num1 = 0.0;
        var num2 = 0.0;
        var operacion = 0;
        var resultado = 0.0;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextDouble();
        mostrar(" ----- Ingrese el número de la operación que desea realizar -----");
        mostrar("1 = suma \n2 = resta \n3 = multiplicación \n4 = división \n5 = raíz cuadrada");

        operacion = sc.nextInt();

        resultado = getResultado(num1, num2, operacion, resultado);
        mostrar("Resultado: " + resultado);
    }

    private static double getResultado(double num1, double num2, int operacion, double resultado) {
        switch (operacion) {
            case 1: // Suma
                resultado = num1 + num2;
                break;
            case 2: // Resta
                resultado = num1 - num2;
                break;
            case 3: // Multiplicación
                resultado = num1 * num2;
                break;
            case 4: // División
                resultado = num1 / num2;
                break;
            case 5: // Raíz cuadrada
                resultado = Math.sqrt(num1);
                break;
            default:
                mostrar("Operación inválida");
        }
        return resultado;
    }

    private static void mostrar(String resultado) {
        System.out.println(resultado);
    }

}
