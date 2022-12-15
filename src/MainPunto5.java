import java.util.LinkedHashSet;
import java.util.List;

public class MainPunto5 {

    public static void main(String[] args) {

        List<Integer> lista = List.of(15, 12, 54, 8, 6, 78, 78, 16, 23, 15, 1, 5, 5, 8, 4, 6, 2, 56);
        LinkedHashSet<Integer> conjunto = new LinkedHashSet<>(lista);
        mostrar(conjunto);

    }

    private static void mostrar(LinkedHashSet<Integer> repetidos) {
        System.out.println("Listas: " + repetidos);
    }


}
