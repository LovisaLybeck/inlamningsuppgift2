package bestgymever;

import javax.swing.JOptionPane;

public class BestGymEver {

    public static void main(String[] args) {

        String personToFind = JOptionPane.showInputDialog("Ange namn eller personnummer: ");
        
        if (personToFind == null) {
            System.exit(0);
        }
        
        ReadFile rf = new ReadFile(); 
        String date = rf.doesPersonExsist("src/bestgymever/customers.txt", personToFind);
        String person = rf.getInformation("src/bestgymever/customers.txt", personToFind);

        if (date.equals("")) {
            JOptionPane.showMessageDialog(null, personToFind + " är ej kund hos oss");

        } else {
            String name = person.substring(0, person.indexOf(","));

            if (new BestGymUtil().haveTheyPayed(date)) {
                String write = new WriteToFile().saveVisits(person, "src/bestgymever/kundbesok.txt");
                JOptionPane.showMessageDialog(null, name
                        + " är en nuvarande kund och betalade senast: " + date
                        + "\n" + write);
                
            } else {
                JOptionPane.showMessageDialog(null, name + " är en föredetta medlem hos oss och betalade senast: " + date);
            }
        }
    }
}
