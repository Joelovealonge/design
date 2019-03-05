/**
 * @description 被装饰者实体
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape : Circle");
    }
}
