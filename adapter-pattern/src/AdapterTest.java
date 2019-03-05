public class AdapterTest {
    public static void main(String [] args) {
        Duck mallardDuck = new MallardDuck();
        Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());
        mallardDuck.quack();
        mallardDuck.fly();
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
