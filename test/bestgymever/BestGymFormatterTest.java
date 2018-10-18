package bestgymever;

import junit.framework.TestCase;
import org.junit.Test;

public class BestGymFormatterTest {
    
    BestGymFormatter bgf =  new BestGymFormatter();
    
    @Test
    public void todayStringTest(){
        TestCase.assertTrue(bgf.todayString().equals("2018-10-19"));
        TestCase.assertFalse(bgf.todayString().equals("2018-10-14"));
    }
}
