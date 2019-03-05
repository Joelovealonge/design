/**
 * @description 环境对象，类似于TreeSet
 */
public class Environment {
    private Strategy strategy;

    public Environment(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return this.strategy.calc(a, b);
    }
}
