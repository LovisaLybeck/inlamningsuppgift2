package bestgymever;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    
    public String doesPersonExsist(String fileToRead, String personToFind){
        
        String tempLine;
        String date = "";
        String[] person = new String[2];
        
        try (BufferedReader reader = new BufferedReader( new FileReader(fileToRead))){
            while((tempLine = reader.readLine()) != null){
                person = tempLine.split(", ");
                
                if(person[0].equalsIgnoreCase(personToFind) || person[1].equalsIgnoreCase(personToFind)){
                    date = reader.readLine();
                    break;
                }
                
                reader.readLine();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            date = "";
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return date;
    }
    
    public String getInformation(String fileToRead, String personToFind){
        String tempLine;
        String person = "";
        String[] personSplit = new String[2];
        
        try (BufferedReader reader = new BufferedReader( new FileReader(fileToRead))){
            while((tempLine = reader.readLine()) != null){
                personSplit = tempLine.split(", ");
                
                if(personSplit[0].equalsIgnoreCase(personToFind) || 
                        personSplit[1].equalsIgnoreCase(personToFind)){
                    person = personSplit[1] + ", " + personSplit[0];
                    break;
                }
                
                reader.readLine();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            person = "";
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return person;
    }
}
