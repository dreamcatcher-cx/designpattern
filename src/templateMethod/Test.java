package templateMethod;

/**
 * Created by chengxiao on 2017/3/8.
 */
public class Test {
    public static void main(String []args){
        AbstractClass a = new ConcreteClassA();
        AbstractClass b = new ConcreteClassB();
        a.templateMethod();
        b.templateMethod();
    }
}
