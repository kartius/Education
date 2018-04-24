package factoryMethod;

public class OSXFactory implements IGUIFactory{
    public IButton createButton() {
        return new OSXButton();
    }
}
