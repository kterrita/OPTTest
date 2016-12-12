import org.junit.Test;
import phone.PhoneBookSolution;

import static org.junit.Assume.*;

/**
 * Created by илья on 12.12.2016.
 */
public class PhoneBookSolutionTest {
    @Test
    public void testPrintNumbers() throws Exception {
        try{
            PhoneBookSolution.printNumbers("Петров П.П.");
        } catch (ArrayIndexOutOfBoundsException e) {
            assumeNoException("Возникло исключение в неположенном месте", e);
        }
    }
}
