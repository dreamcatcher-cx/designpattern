package proxy;

/**
 * Created by chengxiao on 2017/2/28.
 */
public class Proxy implements Subject{
    private Subject subject;
    public Proxy(Subject subject){
        this.subject = subject;
    }
    @Override
    public void request() {
        System.out.println("请求前...");
        subject.request();
        System.out.println("请求后...");
    }
}
