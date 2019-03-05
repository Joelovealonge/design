public class DecoratorTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
    }
}
