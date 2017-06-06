package templateMethod;

/**
 * Created by chengxiao on 2017/3/8.
 */
public class ConcreteClassA extends AbstractClass{
    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类A 方法1实现");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类A 方法2实现");
    }
}
