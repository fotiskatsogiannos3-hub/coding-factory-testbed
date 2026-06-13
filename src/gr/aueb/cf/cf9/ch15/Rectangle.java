package gr.aueb.cf.cf9.ch15;

/**
 * Represents a rectangle shape.
 * Extends {@link AbstractShape} for id management and implements
 * {@link ITwoDimensional} to provide area calculation.
 */
public class Rectangle extends AbstractShape implements ITwoDimensional {

    private double width;
    private double height;

    @Override
    public double getArea() {
        return width * height;
    }
}
