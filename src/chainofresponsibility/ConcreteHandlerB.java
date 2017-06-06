package chainofresponsibility;

/**
 * Created by chengxiao on 2017/6/6.
 */
public class ConcreteHandlerB extends Handler{
    @Override
    public void handlerRequest(int request) {
        if(request>10 && request<=20){
            System.out.println("B已经处理啦");
        }else if(getSuccessor() != null){
            getSuccessor().handlerRequest(request);
        }
    }
}
