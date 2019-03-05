package cglibdynamicproxy;

public class CglibDynamicProxyTest {
    public static void main(String[] args) {
        ScalperMethodInterceptor scalperMethodInterceptor = new ScalperMethodInterceptor();
        CglibTrainStation scalperProxy = (CglibTrainStation) scalperMethodInterceptor.getInstance(new CglibTrainStation());

        scalperProxy.booking();
    }
}
