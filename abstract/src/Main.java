public class Main {
    public static void main(String[] args) {
        // 现在我需要一部vivo手机 和一个mac笔记本
        CybarFactory factory = new CybarFactory();
        PhoneFactory phoneFactory = new IosPhoneFactory();
        Phone phone = phoneFactory.createPhone();
        phone.desc();
    }
}
