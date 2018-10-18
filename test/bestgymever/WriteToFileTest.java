package bestgymever;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import junit.framework.TestCase;
import org.junit.Test;

public class WriteToFileTest {

    WriteToFile wf = new WriteToFile();
    String name;
    String number;
    String date;

    @Test
    public void saveVisitsTest() {
        TestCase.assertTrue(wf.saveVisits("Greger Ganache, 1111111111", "src/bestgymever/kundbesokTest.txt").equals("Besöket sparades i besökloggen"));
        TestCase.assertTrue(wf.saveVisits("Nahema Ninsson, 7805211234", "src/bestgymever/kundbesokTest.txt").equals("Besöket sparades i besökloggen"));

        try (BufferedReader reader = new BufferedReader(new FileReader("src/bestgymever/kundbesokTest.txt"))) {
            name = reader.readLine();
            number = reader.readLine();
            date = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        TestCase.assertTrue(name.equals("Greger Ganache"));
        TestCase.assertTrue(number.equals("1111111111"));
        TestCase.assertTrue(date.equals(new BestGymUtil().todayString()));

        Path path = Paths.get("src/bestgymever/kundbesokTest.txt");

        try {
            Files.delete(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
