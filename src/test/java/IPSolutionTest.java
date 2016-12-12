import ip.IPSolution;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by илья on 12.12.2016.
 */
public class IPSolutionTest {
    @Test
    public void testIpToLong() throws Exception {
        assertEquals("Ожидается 3232235778", 3232235778L, IPSolution.ipToLong("192.168.1.2"));
    }

    @Test
    public void testLongToIp() throws Exception {
       assertEquals("Ожидается 192.168.1.2", "192.168.1.2", IPSolution.longToIp(3232235778L));
    }
}
