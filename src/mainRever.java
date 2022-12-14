public class mainRever {

    public static void main(String[] args) {

        var palabra = "esternocleidomastoideo";
        var aux = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            aux += palabra.charAt(i);
        }
        System.out.println("Frase inicial: " + palabra);
        System.out.println("Frase al reverso: " + aux);

    }
}
