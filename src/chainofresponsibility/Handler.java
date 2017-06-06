package chainofresponsibility;

/**
 * Created by chengxiao on 2017/6/6.
 * 定义一个处理请求的接口，和一个后继连接(可选)
 */
public abstract class Handler {
    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    private Handler successor;

    public abstract void handlerRequest(int request);
}
