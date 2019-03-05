package jdkdynamicproxy;

public class TrainStation implements InterFaceStation {
    @Override
    public void booking() {
        System.out.println("火车站售票");
    }
}
