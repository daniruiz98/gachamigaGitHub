public class Gachamiguero {

    public static String preparar(int n){

        String resultado = String.valueOf(n);

        if (n % 3 == 0)
            resultado = "Gacha";

        if (n % 5 == 0)
            resultado = "miga";

        if(n % 15 == 0)
            resultado =  "Gachamiga";


        return resultado;
    }



}
