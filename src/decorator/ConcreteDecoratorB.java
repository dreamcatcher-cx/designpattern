package decorator;

/**
 * Created by chengxiao on 2017/2/27.
 */
public class ConcreteDecoratorB extends Decorator{
    @Override
    public void operation() {
        super.operation();
        System.out.println("装饰B");
    }
}
