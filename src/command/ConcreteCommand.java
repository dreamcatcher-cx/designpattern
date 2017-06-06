package command;

/**
 * Created by chengxiao on 2017/5/10.
 * 具体命令
 */
public class ConcreteCommand implements Command{
    private Receiver receiver;
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    public void execute(){
        receiver.execute();
    }
}
