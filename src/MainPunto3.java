public class MainPunto3 {

    public static void main(String[] args) {

        System.out.println("*****  Punto 3  *****");
        var palabra = "esternocleidomastoideo";
        getPalabra(palabra);

    }

    private static void getPalabra(String palabra) {
        var palabraInvertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        System.out.println("Palabra inicial: " + palabra);
        System.out.println("Palabra invertida: " + palabraInvertida);
    }

}
