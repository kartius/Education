package factoryMethod;

public class WinFactory implements IGUIFactory {
    public IButton createButton() {
        return new WinButton();
    }
}
