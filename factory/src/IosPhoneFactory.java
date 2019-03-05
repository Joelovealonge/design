public class IosPhoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new IosPhone();
    }
}
