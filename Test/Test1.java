import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Test1 {

    @Test
    public void testFor1(){
        String result = Gachamiguero.preparar(1);
        Assertions.assertEquals("1", result);
    }


    @Test
    public void testFor2(){
        String result = Gachamiguero.preparar(2);
        Assertions.assertEquals("2", result);
    }


    @Test
    public void testFor3(){
        String result = Gachamiguero.preparar(3);
        Assertions.assertEquals("Gacha", result);
    }


    @Test
    public void testFor4(){
        String result = Gachamiguero.preparar(4);
        Assertions.assertEquals("4", result);
    }

    @Test
    public void testFor5(){
        String result = Gachamiguero.preparar(5);
        Assertions.assertEquals("miga", result);
    }
    @Test
    public void testFor6(){
        String result = Gachamiguero.preparar(6);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void testFor7(){
        String result = Gachamiguero.preparar(7);
        Assertions.assertEquals("7", result);
    }


    @Test
    public void testFor8(){
        String result = Gachamiguero.preparar(8);
        Assertions.assertEquals("8", result);
    }

    @Test
    public void testFor9(){
        String result = Gachamiguero.preparar(9);
        Assertions.assertEquals("Gacha", result);
    }


    @Test
    public void testFor10(){
        String result = Gachamiguero.preparar(10);
        Assertions.assertEquals("miga", result);
    }

    @Test
    public void testFor11(){
        String result = Gachamiguero.preparar(11);
        Assertions.assertEquals("11", result);
    }

    @Test
    public void testFor12(){
        String result = Gachamiguero.preparar(12);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void testFor13(){
        String result = Gachamiguero.preparar(13);
        Assertions.assertEquals("13", result);
    }

    @Test
    public void testFor14(){
        String result = Gachamiguero.preparar(14);
        Assertions.assertEquals("14", result);
    }

    @Test
    public void testFor15(){
        String result = Gachamiguero.preparar(15);
        Assertions.assertEquals("Gachamiga", result);
    }

    @Test
    public void testFor16(){
        String result = Gachamiguero.preparar(30);
        Assertions.assertEquals("Gachamiga", result);
    }



}
