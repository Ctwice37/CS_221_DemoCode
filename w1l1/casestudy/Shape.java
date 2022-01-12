/*<listing chapter="1" number="6">*/
/**
 * Listing 1.6
 * @author Koffman and Wolfgang
 */
package w1l1.casestudy;

/** Abstract class for a geometric shape. */
public abstract class Shape {

    /** The name of the shape */
    private String shapeName = "";

    /**
     * Initializes the shapeName.
     * @param shapeName the kind of shape
     */
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    /**
     * Get the kind of shape.
     * @return the shapeName
     */
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String toString() {
        return "Shape is a " + shapeName;
    }
    // abstract methods

    public abstract double computeArea();

    public abstract double computePerimeter();

    public abstract void readShapeData();
}
/*</listing>*/
