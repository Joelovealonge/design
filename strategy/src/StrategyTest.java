/**
 * @description 定义策略模式测试类
 */
public class StrategyTest {
    public static void main(String[] args) {
        Strategy strategy = new AddStrategy();
        Environment environment = new Environment(strategy);
        System.out.println(environment.calculate(12, 13));
        Environment e = new Environment(new Strategy() {
            @Override
            public int calc(int num1, int num2) {
                return num1 * num2;
            }
        });
        System.out.println(e.calculate(10, 12));
    }
}
