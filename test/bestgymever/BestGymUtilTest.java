package bestgymever;

import junit.framework.TestCase;
import org.junit.Test;

public class BestGymUtilTest {

    BestGymUtil util = new BestGymUtil();

    @Test
    public void haveTheyPayedTest() {
        TestCase.assertTrue(util.haveTheyPayed("2018-05-21"));
        TestCase.assertTrue(util.haveTheyPayed("2017-12-21"));
        TestCase.assertFalse(util.haveTheyPayed("2016-05-21"));
        TestCase.assertFalse(util.haveTheyPayed("2017-05-21"));
    }
    
    @Test
    public void todayStringTest() {
        TestCase.assertTrue(util.todayString().equals("2018-10-19"));
        TestCase.assertFalse(util.todayString().equals("2018-10-14"));
    }
}
