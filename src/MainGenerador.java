import java.util.Arrays;

public class MainGenerador {

    public static void main(String[] args) {

        var list = getList();
        String encuentrame = "we";

        String resultado = Arrays.stream(list)
                .filter(s -> s.equalsIgnoreCase(encuentrame))
                .findFirst()
                .orElse(null);

        if(!resultado.isEmpty()){
            System.out.printf("Esta");
        }

    }

    private static String[] getList(){
        String[] listAdd= {"w","e","r","f","b","h","j","i","u","y","t","r","e","d","f","g","u","t","r","e","s","d","f","g",
                "y","u","i","o","l","k","m","n","b","v","f","r","e","w","s","x","f","g","y","u","i","k","m","n","b","v","f","r",
                "e","w","w", "r","t","y","u","i","o","k","m","n","b","v","d","w","s","x","c","f","g","h","u","i","o","p","l","k",
                "n","b","v","f","d","e","w","a","z","x","c","g","h","u","i","o","p","u","y","t","r","e","w","q","s","d","f","g",
                "k","j","b","v","c","x"};
        return listAdd;
    }

}