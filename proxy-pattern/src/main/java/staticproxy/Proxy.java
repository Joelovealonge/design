package staticproxy;

public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        System.out.println("Begin, 相当于代理类添加的额外功能");
        subject.request();
        System.out.println("End,相当于代理类添加的额外功能");
    }
}
