package bestgymever;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BestGymUtil {

    public boolean haveTheyPayed(String date) {

        LocalDate lastPayed = LocalDate.parse(date);
        LocalDate today = LocalDate.parse(todayString());

        long duration = Duration.between(lastPayed.atStartOfDay(), today.atStartOfDay()).toDays();

        return duration <= 352;
    }
    
    public String todayString() {
        LocalDate today = LocalDate.now();
        return today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
