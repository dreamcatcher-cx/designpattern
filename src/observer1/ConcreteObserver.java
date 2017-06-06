package observer1;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by chengxiao on 2017/3/23.
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        ConcreteSubject subject = (ConcreteSubject)o;
        System.out.println("数据已经改变为:"+subject.i);
    }
}
