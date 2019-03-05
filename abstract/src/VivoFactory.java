public class VivoFactory implements CybarFactory {
    @Override
    public Phone createPhone() {
        return new VivoPhone();
    }

    @Override
    public Computer createComputer() {
        return new VivoComputer();
    }
}
