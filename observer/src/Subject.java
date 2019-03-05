public interface Subject {
    /**
     * 注册观察者
     * @param obj
     */
    void registerObserver(Observer obj);
    /**
     * 移除观察者
      */
    void removeObserver(Observer obj);
    /**
     * 通知所有的观察者
     * 当主题方法改变时，这个方法被调用，通知所有的观察者
     */
    void notifyObservers();
}
