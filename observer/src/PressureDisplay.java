public class PressureDisplay implements Observer, DisplayElement {
    private float pressure;
    private Subject weatherData;

    /**
     * 构造器用来注册观察者
     */
    public PressureDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("PressureDisplay pressure :" + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }
}
