package bestgymever;

import junit.framework.TestCase;
import org.junit.Test;

public class ReadFileTest {

    ReadFile rf = new ReadFile();

    @Test
    public void doesPersonExsistTest() {
        TestCase.assertTrue(rf.doesPersonExsist("src/bestgymever/customers.txt", "alhambra aromes").equals("2017-07-01"));
        TestCase.assertTrue(rf.doesPersonExsist("src/bestgymever/customers.txt", "2222222222").equals("2016-03-07"));
        TestCase.assertFalse(rf.doesPersonExsist("src/bestgymever/customers.txt", "Alhambra Aromes").equals("2017-07-03"));
        TestCase.assertTrue(rf.doesPersonExsist("src/bestgymever/customers.txt", "abc defgh").equals(""));
    }

    @Test
    public void getInformationTest() {
        TestCase.assertTrue(rf.getInformation("src/bestgymever/customers.txt", "alhambra aromes").equals("Alhambra Aromes, 7603021234"));
        TestCase.assertTrue(rf.getInformation("src/bestgymever/customers.txt", "2222222222").equals("Ida Idylle, 2222222222"));
        TestCase.assertFalse(rf.getInformation("src/bestgymever/customers.txt", "Alhambra Aromes").equals("2017-07-03"));
        TestCase.assertTrue(rf.getInformation("src/bestgymever/customers.txt", "abc defgh").equals(""));
    }
}
