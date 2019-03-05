public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new IosPhoneFactory();
        Phone phone = phoneFactory.createPhone();
        phone.desc();
    }
}
