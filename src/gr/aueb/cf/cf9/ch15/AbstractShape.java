package gr.aueb.cf.cf9.ch15;

/**
 * Base class for all shapes.
 * Provides a shared id field and implements the {@link IShape} contract
 * so that subclasses do not need to repeat this logic.
 */
public abstract class AbstractShape implements IShape {

    private long id;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }
}