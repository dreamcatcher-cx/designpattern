package command1;

/**
 * Created by chengxiao on 2017/5/11.
 * 具体命令A
 */
public class ConcreteCommandA implements Command{

    private ReceiverOne receiverOne;
    public ConcreteCommandA(ReceiverOne one){
        this.receiverOne = one;
    }
    @Override
    public void execute() {
        receiverOne.execute();
    }
}
