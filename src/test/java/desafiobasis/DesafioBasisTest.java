package desafiobasis;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ulisses Carvalho
 */
public class DesafioBasisTest {
    
    public DesafioBasisTest() {
    }
    
    
    /**
     * Test of verificarBalanceamento method, of class DesafioBasis.
     */
    @Test
    public void testVerificarBalanceamento() {
        System.out.println("verificarBalanceamento");
        String txt = "";
        boolean expResult = true;
        boolean result = DesafioBasis.verificarBalanceamento(txt);
        assertEquals(expResult, result);

    }
    
}
