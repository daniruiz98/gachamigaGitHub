import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Test1 {

    @Test
    public void testFor1(){
        String result = V2.cocinar(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    public void testFor2(){
        String result = V2.cocinar(2);
        Assertions.assertEquals("2", result);
    }

    @Test
    public void testFor3(){
        String result = V2.cocinar(3);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void testFor4(){
        String result = V2.cocinar(4);
        Assertions.assertEquals("4", result);
    }

    @Test
    public void testFor5(){
        String result = V2.cocinar(5);
        Assertions.assertEquals("miga", result);
    }

    @Test
    public void testFor6(){
        String result = V2.cocinar(6);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void testFor7(){
        String result = V2.cocinar(7);
        Assertions.assertEquals("7", result);
    }

    @Test
    public void testFor8(){
        String result = V2.cocinar(8);
        Assertions.assertEquals("8", result);
    }

    @Test
    public void testFor9(){
        String result = V2.cocinar(9);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void testFor10(){
        String result = V2.cocinar(10);
        Assertions.assertEquals("miga", result);
    }



}
