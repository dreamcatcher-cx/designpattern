package command1;

/**
 * Created by chengxiao on 2017/5/11.
 */
public class Test {
    public static void main(String []args){
        Command command1 = new ConcreteCommandA(new ReceiverOne());
        Command command2 = new ConcreteCommandB(new ReceiverTwo());
        Invoker invoker = new Invoker();
        invoker.addCommand(command1);
        invoker.addCommand(command2);
        invoker.execute();
    }
}
