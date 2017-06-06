package proxy;

/**
 * Created by chengxiao on 2017/2/28.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实请求来啦。。。");
    }
}
