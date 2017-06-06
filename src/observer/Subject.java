package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengxiao on 2017/3/23.
 * 抽象主题类
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 添加观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知
     */
    public void myNotify(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
