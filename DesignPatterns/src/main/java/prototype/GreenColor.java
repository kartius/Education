package prototype;

public class GreenColor extends Color {

    public GreenColor() {
        colorName = "creen";
    }

    @Override
    void addColor() {
        System.out.println("Green color added");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (GreenColor) super.clone();
    }
}
