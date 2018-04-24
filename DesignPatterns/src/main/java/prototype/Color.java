package prototype;

public abstract class Color implements Cloneable {

    protected String colorName;

    abstract void addColor();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Color)super.clone();
    }
}
