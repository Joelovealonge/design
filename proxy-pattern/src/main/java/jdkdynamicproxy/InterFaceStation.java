package jdkdynamicproxy;

/**
 * @description jdk的动态代理必须代理的是一个接口，如果没有接口，则必须用Cglib方式进行动态代理
 */
public interface InterFaceStation {
    void booking();
}
