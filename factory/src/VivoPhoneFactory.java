public class VivoPhoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new VivoPhone();
    }
}
