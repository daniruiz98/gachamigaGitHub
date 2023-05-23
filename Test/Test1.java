import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Test1 {

    @Test
    public void testFor1(){
        String result = Gachamiguero.preparar(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    public void testFor3(){
        String result = Gachamiguero.preparar(3);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void testFor5(){
        String result = Gachamiguero.preparar(5);
        Assertions.assertEquals("miga", result);
    }

    @Test
    public void testFor15(){
        String result = Gachamiguero.preparar(15);
        Assertions.assertEquals("Gachamiga", result);
    }


}
