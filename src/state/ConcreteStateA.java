package state;

/**
 * Created by chengxiao on 2017/6/5.
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("切换到状态A了");
        context.setState(new ConcreteStateB());
    }
}
