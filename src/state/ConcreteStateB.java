package state;

/**
 * Created by chengxiao on 2017/6/5.
 */
public class ConcreteStateB implements State{
    @Override
    public void handle(Context context) {
        System.out.println("切换到状态B啦");
        context.setState(new ConcreteStateA());
    }
}
