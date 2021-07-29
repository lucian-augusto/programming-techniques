import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Lucian Augusto
 * @version 1.0
 */
public class MapTester
{
    private Map<String, String> phoneBook = new HashMap();

    public void enterNumber(String name, String number) {
        String nameKey = name.toLowerCase().trim();
        
        if (internalLookupNumber(nameKey) != null) {
            if (!shouldReplace(name)) {
                System.out.println("Number will not be replaced.");
                return;
            }
            System.out.println("Replacing number...");
        }
        phoneBook.put(nameKey, number);
    }
    
    public String lookupNumber(String name) {
        String phoneNumber = internalLookupNumber(name.toLowerCase().trim());
        
        if (phoneNumber == null) {
            System.out.println("Key " + name + " does not exist");
        }
        return phoneNumber;
    }
    
    private String internalLookupNumber(String name) {
        return phoneBook.get(name);
    }
    
    private boolean shouldReplace(String name) {
        Character c = ' ';
        Scanner scanner = new Scanner(System.in);
        while (c != 'y' && c != 'n') {
            System.out.println("A entry for the name " + name + " already exists. Do you want to replace it? (y/n):");
            c = Character.toLowerCase(scanner.next().charAt(0));
            
        }
        scanner.close();
        
        return c == 'y';
    }
}
