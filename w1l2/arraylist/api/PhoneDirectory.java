package w1l2.arraylist.api;

/**
 * This is an implementation of the PhoneDirectoryInterface
 * that uses an ArrayList to store the data.
 * @author Koffman and Wolfgang
 */
import java.util.ArrayList;

public class PhoneDirectory {

    // Data fields
    /** The ArrayList to contain the directory data */
    private ArrayList<DirectoryEntry> theDirectory =
            new ArrayList<DirectoryEntry>();


    /*<exercise chapter="2" section="2" type="programming" number="1">*/
    /**
     * Add an entry or change an existing entry.
     * @param name The name of the person being added or changed.
     * @param newNumber The new number to be assigned.
     * @return The old number, or if a new entry, null.
     */
    public String addOrChangeEntry(String name,
            String newNumber) {
        int index = 0;
        String oldNumber = null;
        while (index < theDirectory.size()
                && !theDirectory.get(index).getName().equals(name)) {
            index++;
        }
        if (index < theDirectory.size()) {
            oldNumber = theDirectory.get(index).getNumber();
            theDirectory.get(index).setNumber(newNumber);
        } else {
            theDirectory.add(new DirectoryEntry(name, newNumber));
        }
        return oldNumber;
    }
    /*</exercise>*/


    /*<exercise chapter="2" section="2" type="programming" number="2">*/
    /**
     * Remove an entry
     * @param aName The name of the person to be removed
     * @return The entry removed, or null if there is no entry for aName
     * @post The directory no longer contains an entry for aName
     */
    public DirectoryEntry removeEntry(String aName) {
        int index = 0;
        String oldNumber = null;
        while (index < theDirectory.size()
                && !theDirectory.get(index).getName().equals(aName)) {
            index++;
        }
        if (index < theDirectory.size()) {
            return theDirectory.remove(index);
        } else {
            return null;
        }
    }
    /*</exercise>*/
    
}
