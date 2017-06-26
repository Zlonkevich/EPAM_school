import main.Mod;
import org.junit.Assert;
import org.junit.Test;


public class ModTest extends Assert{


    @Test
    public void posDevision(){
        assertTrue(Mod.mod(0, 1) == 0);
        assertTrue(Mod.mod(0, 2) == 0);
        assertTrue(Mod.mod(1, 1) == 0);
        assertTrue(Mod.mod(2, 3) == 2);
        assertTrue(Mod.mod(3, 3) == 0);
        assertTrue(Mod.mod(4, 3) == 1);
        assertTrue(Mod.mod(100, 3) == 1);
        assertTrue(Mod.mod(Integer.MAX_VALUE, 3) == 1);


        assertTrue(Mod.mod(-1, 1) == 0);
        assertTrue(Mod.mod(-2, 3) == -2);
        assertTrue(Mod.mod(-3, 3) == 0);
        assertTrue(Mod.mod(-4, 3) == -1);
        assertTrue(Mod.mod(-100, 3) == -1);
        assertTrue(Mod.mod(-Integer.MAX_VALUE, 3) == -1);
    }

    @Test
    public void negDevision(){
        assertTrue(Mod.mod(0, -1) == 0);
        assertTrue(Mod.mod(0, -2) == 0);
        assertTrue(Mod.mod(1, -1) == 0);
        assertTrue(Mod.mod(2, -3) == 2);
        assertTrue(Mod.mod(3, -3) == 0);
        assertTrue(Mod.mod(4, -3) == -1);
        assertTrue(Mod.mod(100, -3) == -1);
        assertTrue(Mod.mod(Integer.MAX_VALUE, -3) == -1);


        assertTrue(Mod.mod(-1, -1) == 0);
        assertTrue(Mod.mod(-2, -3) == -2);
        assertTrue(Mod.mod(-3, -3) == 0);
        assertTrue(Mod.mod(-4, -3) == 1);
        assertTrue(Mod.mod(-100, -3) == 1);
        assertTrue(Mod.mod(Integer.MAX_VALUE, -3) == -1);

    }


}
