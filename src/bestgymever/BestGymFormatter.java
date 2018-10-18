package bestgymever;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BestGymFormatter {
    
    public String todayString(){
        LocalDate today = LocalDate.now();
        String todayString = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return todayString;
    }
}
