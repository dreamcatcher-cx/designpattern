package proxy;

/**
 * Created by chengxiao on 2017/2/28.
 */
public class Test {
    public static void main(String []args){
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();

        Subject proxy1 = new Proxy(new RealSubject());
        proxy1.request();
    }
}
