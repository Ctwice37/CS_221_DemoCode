/*<listing chapter="1" number="3">*/
/**
 * Listing 1.3
 * @author Koffman and Wolfgang
 */
package w1l1;

/**
 * Class that represents a notebook computer.
 */
public class Notebook extends Computer {
    // Data Fields

    private double screenSize;
    private double weight;

    // Methods
    /**
     * Initializes a Notebook object with all properties specified.
     * @param man The computer manufacturer
     * @param proc The processor type
     * @param ram The RAM size
     * @param disk The disk size
     * @param procSpeed The processor speed
     * @param screen The screen size
     * @param wei The weight
     */
    public Notebook(String man, String proc, double ram, int disk,
            double procSpeed, double screen, double wei) {

        super(man, proc, ram, disk, procSpeed);
        screenSize = screen;
        weight = wei;
    }

    /*<exercise chapter="1" section="3" type="programming" number="1">*/
    public Notebook(String processor, double ram, int disk) {
        this("Default", processor, ram, disk, 2.5, 17, 5.5);
    }
    /*</exercise>*/

    /*<exercise chapter="1" section="2" number="2" type="programming">*/
    // Accessor and modifier methods
    public double getScreenSize() {
        return screenSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setScreenSize(double screen) {
        screenSize = screen;
    }

    public void setWeight(double wei) {
        weight = wei;
    }
    
    /**
     * Determine if this Notebook is equal to the other
     * object
     *
     * @param obj The object to compare this Notebook to
     *
     * @return true If the other object is of type Notebook and all
     *         data fields are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() == this.getClass()) {
            Notebook other = (Notebook) obj;

            return getManufacturer().equals(other.getManufacturer())
                    && getProcessor().equals(other.getProcessor())
                    && (getRamSize() == other.getRamSize())
                    && (getDiskSize() == other.getDiskSize())
                    && (getProcessorSpeed() == other.getProcessorSpeed())
                    && (getScreenSize() == other.getScreenSize())
                    && (getWeight() == other.getWeight());
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Computer comp[] = new Computer[3];
        comp[0] = new Computer("Ace", "AMD", 3, 160, 2.4);
        comp[1] = new Notebook2("Dell", "Intel", 4, 350, 2.2, 15.5, 7.5);
        comp[2] = comp[1];

        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i].toString());
        }
        
        System.out.println("Equality : " + comp[1].equals(comp[2]));
        System.out.println("Equality : " + comp[0].equals(comp[2]));
        
    } 
    
}

