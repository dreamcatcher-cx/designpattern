package observer;

/**
 * Created by chengxiao on 2017/3/23.
 */
public class Test {
    public static void main(String []args){
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver("乘客A",subject);
        Observer observer2 = new ConcreteObserver("乘客B",subject);
        Observer observer3 = new ConcreteObserver("乘客C",subject);
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.setSubjectState("火车来啦");
        subject.myNotify();

    }
}
