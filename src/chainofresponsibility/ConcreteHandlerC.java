package chainofresponsibility;

/**
 * Created by chengxiao on 2017/6/6.
 */
public class ConcreteHandlerC extends Handler{
    @Override
    public void handlerRequest(int request) {
        if(request>20 && request<=30){
            System.out.println("C已经处理啦");
        }else if(getSuccessor() != null){
            getSuccessor().handlerRequest(request);
        }
    }
}
