package w1l1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Person is a class that represents a human being.
 *
 * @author Koffman and Wolfgang
 */
public class Person {
    // Constants

    /** The age at which a person can vote */
    private static final int VOTE_AGE = 18;
    /** The age at which a person is considered a senior citizen */
    private static final int SENIOR_AGE = 65;
    // Data Fields
    /** The first name */
    private String firstName;
    /** The last name */
    private String lastName;
    /** The ID number */
    private String IDNumber;
    /** The birth year */
    private String birthDate;

    private LocalDate birthday;
    // Constructors
    /**
     * Construct a person with given values
     * @param first The first name
     * @param last The last name
     * @param ID The ID number
     * @param birth The birth date
     */
    public Person(String first, String last, String ID, String birth) {
        firstName = first;
        lastName = last;
        IDNumber = ID;
        birthDate = birth;
    }

    /**
     * Construct a person with only an IDNumber specified.
     * @param ID The ID number
     */
    public Person(String ID) {
        IDNumber = ID;
    }

    // Modifier Methods
    /**
     * Sets the firstName field.
     *
     * @param first The first name
     */
    public void setFirstName(String first) {
        firstName = first;
    }

    /**
     * Sets the lastName field.
     *
     * @param last The last name
     */
    public void setLastName(String last) {
        lastName = last;
    }

    
     /**
     * Gets the person's first name.
     *
     * @return the first name as a String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the person's last name.
     *
     * @return the last name as a String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the person's ID number.
     *
     * @return the ID number as a String
     */
    public String getIDNumber() {
        return IDNumber;
    }

   // Other Methods
    /**
     * Calculates a person's age at this year's birthday.
     *
     * @param year The current year
     *
     * @return the year minus the birth year
     */
    public int age() {
    	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
    	 birthday = LocalDate.parse(birthDate, formatter);
    	 LocalDate today = LocalDate.now();
         Period yp = Period.between(birthday, today);
         return yp.getYears();
    }

    /**
     * Determines whether a person can vote.
     *
     * @param year The current year
     *
     * @return true if the person's age is greater than or equal to
     *         the voting age
     */
    public boolean canVote() {
        int theAge = age();

        return theAge >= VOTE_AGE;
    }

    /**
     * Determines whether a person is a senior citizen.
     *
     * @param year the current year
     *
     * @return true if person's age is greater than or equal to the
     *         age at which a person is considered to be a senior
     *         citizen
     */
    public boolean isSenior() {
        return age() >= SENIOR_AGE;
    }

    /**
     * Retrieves the information in a Person object.
     *
     * @return the object state as a string
     */
    @Override
    public String toString() {
        return "First name: " + firstName + "\n" + "Last name: "
                + lastName + "\n" + "ID number: " + IDNumber + "\n"
                + "Age: " + age() + "\n";
    }

    /**
     * Compares two Person objects for equality.
     *
     * @param per The second Person object
     *
     * @return true if the Person objects have same ID number; false
     *         if they don't
     */
    public boolean equals(Person per) {
        if (per == null) {
            return false;
        } else {
            return IDNumber.equals(per.IDNumber);
        }
    }

    /*<exercise chapter="1" section="1" type="programming" number="2">*/
    /**
     * Method to compare two Person objects based on name.
     *
     * @param per The Person object to compare this Person object to
     *
     * @return0 If this Person is less than (alphabetically before)
     *         per 0 If this Person is equal to per >0 If this
     *         Person is greater than (alphabetically after) per
     */

    /*</exercise>*/
    public int compareTo(Person per) {
        if (lastName.equals(per.lastName)) {
            return firstName.compareTo(per.firstName);
        } else {
            return lastName.compareTo(per.lastName);
        }
    }

    /*<exercise chapter="1" section="1" type="programming" number="3">*/
    /**
     * Method to set the last name of this Person to a new
     * value provided that justMarried is true.
     *
     * @param justMarried true if this Person's name is to be changed
     *        param newLast The new last name if justMarried is true
     * @param newLast DOCUMENT ME!
     *
     * @post lastName is equal to newLast if justMarried is true
     *       otherwise no change is made to this Person
     */

    /*</exercise>*/
    public void changeLastName(boolean justMarried, String newLast) {
        if (justMarried) {
            lastName = newLast;
        }
    }
    public static void main(String args[]){
    	
    	// Invoke the Constructor Person(String first, String last, String ID, String birth)
    	// birth date should be in yyyy-MM-dd format (e.g. 1980-9-28)
    	
    	Person p1 = new Person("John","Devis","451-33-789","1979-9-27");
    	System.out.println("Age of a Person p1 = " + p1.age());
    	System.out.println("Can Vote : " + p1.canVote());
    	System.out.println("Is Senior : " + p1.isSenior());
        	
    }
   }
