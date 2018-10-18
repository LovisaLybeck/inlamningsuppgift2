package bestgymever;

import java.time.Duration;
import java.time.LocalDate;

public class Member {
    
    public boolean haveTheyPayed(String date){
        
        BestGymFormatter bgf =  new BestGymFormatter();
        boolean result = false;
        
        LocalDate lastPayed = LocalDate.parse(date);
        LocalDate today = LocalDate.parse(bgf.todayString());
                
        long duration = Duration.between(lastPayed.atStartOfDay(), today.atStartOfDay()).toDays();
        
        if(duration <= 352){
            result = true;
        }
        
        return result;
    }
}
