package state;

/**
 * Created by chengxiao on 2017/6/5.
 */
public class Test {
    public static void main(String []args){
        State initState = new ConcreteStateA();
        Context context = new Context(initState);
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
