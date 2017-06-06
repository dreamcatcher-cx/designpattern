package templateMethod;

/**
 * Created by chengxiao on 2017/3/8.
 */
public abstract class AbstractClass {
    protected abstract void primitiveOperation1();
    protected abstract void primitiveOperation2();
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("模板方法执行结束");
    }
}
