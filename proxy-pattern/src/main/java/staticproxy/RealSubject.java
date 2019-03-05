package staticproxy;

public class RealSubject implements Subject {

    public void request() {
        System.out.println("RealSubject,相当于火车站");
    }
}
