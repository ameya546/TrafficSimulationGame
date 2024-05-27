package Map;

/**
 * Represents a point in two-dimensional space. This class encapsulates
 * the x and y coordinates of a point, providing a basic structure for
 * representing locations or positions within the map.
 */
public class Point {
    /**
     * The x-coordinate of the point.
     */
    private double x;

    /**
     * The y-coordinate of the point.
     */
    private double y;

    /**
     * Retrieves the x-coordinate of this point.
     *
     * @return The x-coordinate value of this point.
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of this point.
     *
     * @param x The new x-coordinate value for this point.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Retrieves the y-coordinate of this point.
     *
     * @return The y-coordinate value of this point.
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of this point.
     *
     * @param y The new y-coordinate value for this point.
     */
    public void setY(double y) {
        this.y = y;
    }
}