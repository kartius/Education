package factoryMethod;

public enum EnumSwitcher {
    OSX("OSX", new OSXFactory()),
    WIN("WIN", new WinFactory());
    IGUIFactory factory;
    String string;
    EnumSwitcher(String string, IGUIFactory factory) {
        this.string = string;
        this.factory = factory;
    }
    static IGUIFactory getFactory(String string) {
        for (EnumSwitcher enumSwitcher: EnumSwitcher.values()) {
            if (enumSwitcher.string.equals(string)) {
                return enumSwitcher.factory;
            }
        }
        return null;
    }
}
