import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        int i = observers.indexOf(obj);
        if (i >= 0) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 天气改变
     */
    private void  measurementsChanged() {
        // 通知观察者
        notifyObservers();
    }

    /**
     * 设置天气相关参数，即更新天气状况
     * 只有更新天气后就调用天气改变通知观察者
     */
    public void  setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
