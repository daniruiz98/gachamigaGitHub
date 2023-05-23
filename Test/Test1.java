import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Test1 {

    @Test
    public void testFor1(){
        String result = V3.catar(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    public void testFor3(){
        String result = V3.catar(3);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void testFor5(){
        String result = V3.catar(5);
        Assertions.assertEquals("miga", result);
    }

    @Test
    public void testFor15(){
        String result = V3.catar(15);
        Assertions.assertEquals("Gachamiga", result);
    }




}
