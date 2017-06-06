package command;

/**
 * Created by chengxiao on 2017/5/10.
 */
public class Test {
    public static void main(String []args){
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.execute();
    }
}
