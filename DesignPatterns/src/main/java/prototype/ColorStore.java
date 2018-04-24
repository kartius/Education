package prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    private static Map<String, Color> colorMap = new HashMap();

    static
    {
        colorMap.put("red", new RedColor());
        colorMap.put("green", new GreenColor());
    }

    public static Color getColor(String colorName) throws CloneNotSupportedException {
        return (Color) colorMap.get(colorName).clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ColorStore.getColor("red").addColor();
        ColorStore.getColor("green").addColor();
        ColorStore.getColor("red").addColor();
    }
}
