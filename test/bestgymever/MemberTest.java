package bestgymever;

import junit.framework.TestCase;
import org.junit.Test;

public class MemberTest {
    
    Member m = new Member();
    
    @Test
    public void haveTheyPayedTest(){
        TestCase.assertTrue(m.haveTheyPayed("2018-05-21"));
        TestCase.assertTrue(m.haveTheyPayed("2017-12-21"));
        TestCase.assertFalse(m.haveTheyPayed("2016-05-21"));
        TestCase.assertFalse(m.haveTheyPayed("2017-05-21"));
    }
}
