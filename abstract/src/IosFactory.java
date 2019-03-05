public class IosFactory implements CybarFactory {
    @Override
    public Phone createPhone() {
        return new IosPhone();
    }

    @Override
    public Computer createComputer() {
        return new IosComputer();
    }
}
