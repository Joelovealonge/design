package jdkdynamicproxy;

public class JdkDynamicProxyTest {
    public static void main(String[] args) {
        InterFaceStation station = new TrainStation();
        ScalperInvocationHandler handler = new ScalperInvocationHandler(station);
        // 得到代理对象，即黄牛scalper
        InterFaceStation scalper = (InterFaceStation) handler.getProxy();
        scalper.booking();
    }
}
