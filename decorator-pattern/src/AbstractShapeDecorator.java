/**
 * @description 实现了Shape接口的抽象装饰类
 */
public abstract class AbstractShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public AbstractShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
