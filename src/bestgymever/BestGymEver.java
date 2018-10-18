package bestgymever;

import javax.swing.JOptionPane;

public class BestGymEver {

    public static void main(String[] args) {
        
        ReadFile rf = new ReadFile();
        Member m = new Member();
        WriteToFile wf = new WriteToFile();
        
        String personToFind = JOptionPane.showInputDialog("Ange namn eller personnummer: ");
        String date = rf.doesPersonExsist("src/bestgymever/customers.txt", personToFind);
        String person = rf.getInformation("src/bestgymever/customers.txt", personToFind);
        String name;
        
        if(personToFind == null){
            System.exit(0);
        }
        
        if(date.equals("")){
            JOptionPane.showMessageDialog(null, personToFind + " är ej kund hos oss");
        }else{
            boolean currentMember = m.haveTheyPayed(date);
            name = person.substring(0, person.indexOf(","));
            
            if(!currentMember){
                JOptionPane.showMessageDialog(null, name + " är en föredetta medlem hos oss och betalade senast: " + date);
            }else{
                String write = wf.saveVisits(person, "src/bestgymever/kundbesok.txt");
                JOptionPane.showMessageDialog(null, name + 
                        " är en nuvarande kund och betalade senast: " + date 
                        + "\n" + write);
                
            }
        }
    }
}
