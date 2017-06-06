package observer;

/**
 * Created by chengxiao on 2017/3/23.
 */
public class ConcreteObserver extends Observer{
    private ConcreteSubject concreteSubject;
    private String name;
    private String observerState;
    public ConcreteObserver(String name,ConcreteSubject concreteSubject){
        this.name = name;
        this.concreteSubject = concreteSubject;
    }
    @Override
    public void update() {
        this.observerState = concreteSubject.getSubjectState();
        System.out.println(observerState+"，"+name+"上车了");
    }
}
