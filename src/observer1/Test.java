package observer1;


import java.util.Observer;

/**
 * Created by chengxiao on 2017/3/23.
 */
public class Test {
    public static void main(String []args){
        ConcreteSubject subject = new ConcreteSubject();
        Observer o1 = new ConcreteObserver();
        Observer o2 = new ConcreteObserver();
        Observer o3 = new ConcreteObserver();
        subject.addObserver(o1);
        subject.addObserver(o2);
        subject.addObserver(o3);
        subject.setDate(1);
        subject.setDate(2);
    }
}
