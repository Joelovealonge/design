public interface Observer {
    /**
     * 每当主题（被观察者）状态改变时，这个方法就会被调用
     * 每个观察者必须实现该接口
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temperature, float humidity, float pressure);
}
