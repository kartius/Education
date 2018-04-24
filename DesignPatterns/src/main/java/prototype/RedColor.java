package prototype;

public class RedColor extends Color {

    public RedColor() {
        colorName = "red";
    }

    @Override
    void addColor() {
        System.out.println("Red color added");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (RedColor) super.clone();
    }
}
