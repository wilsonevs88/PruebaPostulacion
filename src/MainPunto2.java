import java.util.List;

public class MainPunto2 {

    public static void main(String[] args) {

        System.out.println("*****  Punto 2  *****");
        getOrdenarmiento();

    }

    private static List<Integer> getList(){
        List<Integer> listAdd = List.of(15,12,54,8,6,78,78,16,23,15,1,5,5,8,4,6,2,56);
        return listAdd;
    }

    private static void getOrdenarmiento(){
        var list = getList();
        var suma = 0;
        var max = 0;
        var min = 0;

        // Calculamos la suma de todos los elementos de la lista
        for (var numero : list) {
            suma += numero;
            max = Math.max(max, numero);
            min = Math.min(min, numero);
        }

        // Calculamos el promedio
        var promedio = (double) suma / list.size();

        System.out.println("Promedio: " + promedio);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }

}
