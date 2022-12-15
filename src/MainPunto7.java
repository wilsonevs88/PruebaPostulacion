import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainPunto7 {

    public static void main(String[] args) {

        System.out.print("*****  Punto 7  *****");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nBuscar palabra: ");
        getPalabras(sc.nextLine().toLowerCase());


    }

    private static List<String> getPalabraCadena(String buscarPalabra) {
        var arr = buscarPalabra.split("\\B");
        return Arrays.asList(arr);
    }

    private static void getPalabras(String palabra) {
        var obtenerPalabra = getPalabraCadena(palabra);
        var lista = getList();
        var aux = "";

        for (int i = 0; i < obtenerPalabra.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (obtenerPalabra.get(i).equals(lista.get(j))) {
                    aux += lista.get(j);
                    break;
                }
            }
        }

        if (!aux.equals(palabra)) {
            System.out.printf("La palabra %s no se encontro", palabra);
        } else {
            System.out.printf("%s fue encontrado", palabra);
        }
    }

    private static List<String> getList() {
        var lista = List.of("w", "e", "r", "f", "b", "h", "j", "i", "u", "y", "t", "r", "e", "d",
                "f", "g", "u", "t", "r", "e", "s", "d", "f", "g", "y", "u", "i", "o", "l", "k", "m", "n", "b", "v",
                "f", "r", "e", "w", "s", "x", "f", "g", "y", "u", "i", "k", "m", "n", "b", "v", "f", "r", "e", "w",
                "w", "r", "t", "y", "u", "i", "o", "k", "m", "n", "b", "v", "d", "w", "s", "x", "c", "f", "g", "h",
                "u", "i", "o", "p", "l", "k", "n", "b", "v", "f", "d", "e", "w", "a", "z", "x", "c", "g", "h", "u",
                "i", "o", "p", "u", "y", "t", "r", "e", "w", "q", "s", "d", "f", "g", "k", "j", "b", "v", "c", "x");
        return lista;
    }

}
