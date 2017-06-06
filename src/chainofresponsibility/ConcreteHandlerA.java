package chainofresponsibility;

/**
 * Created by chengxiao on 2017/6/6.
 */
public class ConcreteHandlerA extends Handler{
    @Override
    public void handlerRequest(int request) {
        if(request>0 && request<=10){
            System.out.println("A已经处理啦");
        }else if(this.getSuccessor() != null){
            this.getSuccessor().handlerRequest(request);
        }
    }
}
