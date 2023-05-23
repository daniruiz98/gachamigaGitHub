public class V2 {

    public static String cocinar(int n){

        String resultado = n + "";

        if (n % 3 == 0)
            resultado = "Gacha";

        if (n % 5 == 0)
            resultado = "miga";

        if(n % 3 == 0 && n % 5 == 0)
            resultado =  "Gachamiga";


        return resultado;
    }



}
