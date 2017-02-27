package decorator;

/**
 * Created by chengxiao on 2017/2/27.
 */
public class Test {
    public static void main(String []args){
        Component component = new ConcreteComponent();
        Decorator d1 = new ConcreteDecoratorA();
        Decorator d2 = new ConcreteDecoratorB();
        d1.setComponent(component);
        d2.setComponent(d1);
        d2.operation();
    }
}
