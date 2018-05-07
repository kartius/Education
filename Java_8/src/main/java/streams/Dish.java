package streams;

public class Dish {
    private final int price;
    private final String name;
    private final boolean isVegeterian;

    public Dish(int price, String name, boolean isVegeterian) {
        this.price = price;
        this.name = name;
        this.isVegeterian = isVegeterian;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public boolean isVegeterian() {
        return this.isVegeterian;
    }

    public String toString() {
        return "{price: " + this.price + ", name: " + this.name + ", isVegeterian: " + this.isVegeterian + "}";
    }
}
