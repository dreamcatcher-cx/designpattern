package command1;

/**
 * Created by chengxiao on 2017/5/11.
 * 实际命令B
 */
public class ConcreteCommandB implements Command{
    private ReceiverTwo receiverTwo;
    public ConcreteCommandB(ReceiverTwo receiverTwo){
        this. receiverTwo = receiverTwo;
    }
    @Override
    public void execute() {
        receiverTwo.run();
    }
}
