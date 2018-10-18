package bestgymever;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;


public class WriteToFile {
    
    public String saveVisits(String person, String fileToSave){
        String[] personList = new String[2];
        personList = person.split(", ");
        
        BestGymFormatter bgf =  new BestGymFormatter();
        String today = bgf.todayString();
        
        Path path = Paths.get(fileToSave);
        
        try{
            if(!Files.exists(path, LinkOption.NOFOLLOW_LINKS))
                Files.createFile(path);
        }catch(IOException e){
            e.printStackTrace();
        }
        
        try(BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND)){
            writer.write(personList[0] + "\n");
            writer.write(personList[1] + "\n");
            writer.write(today + "\n");
            
            writer.close();
            
            return "Besöket sparades i besökloggen";
            
        }catch(IOException e){
            e.printStackTrace();
            return "Besöket kunde inte sparas i besöksloggen";
        }
    }
}
