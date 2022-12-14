public class MainList {

    public static void main(String[] args) {

        System.out.println("Se ordena de menor a mayor");
        getOrdenarmiento();

    }

    private static int[] getList(){
        int[] listAdd= {15,12,54,8,6,78,78,16,23,15,1,5,5,8,4,6,2,56};
        return listAdd;
    }

    private static void getOrdenarmiento(){
        var list = getList();
        var valorMax = 0;
        var aux = 0;
        var max = 0;
        for(Integer num: list){
            if ( num > valorMax ) {
                valorMax = num;
            }
            if ( valorMax > max ) {
                aux = max;
                max = valorMax;
                valorMax = aux;
            }
            System.out.println(valorMax);
        }
    }

}
