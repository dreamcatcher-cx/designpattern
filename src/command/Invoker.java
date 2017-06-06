package command;

/**
 * Created by chengxiao on 2017/5/10.
 */
public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command = command;
    }
    public void execute(){
        command.execute();
    }
}
