package gr.aueb.cf.cf9.ch15;

/**
 * Represents a circle shape.
 * Extends {@link AbstractShape} for id management and implements
 * {@link ITwoDimensional} to provide area calculation.
 */
public class Circle extends AbstractShape implements ITwoDimensional {

    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}