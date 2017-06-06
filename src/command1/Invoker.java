package command1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengxiao on 2017/5/11.
 * 调用者
 */
public class Invoker {
    private List<Command> commandList = new ArrayList<Command>();
    public void addCommand(Command command){
        commandList.add(command);
    }
    public void execute(){
        for(Command command : commandList){
            command.execute();
        }
    }
}
