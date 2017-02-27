package decorator;

/**
 * Created by chengxiao on 2017/2/27.
 * 具体的装饰者类
 */
public class ConcreteDecoratorA extends Decorator{
    @Override
    public void operation() {
        super.operation();
        this.addedState = "测试状态";
        System.out.println("装饰A");
    }

    //本类独有的功能
    private String addedState;

}
