package observer1;

import java.util.Observable;

/**
 * Created by chengxiao on 2017/3/23.
 */
public class ConcreteSubject extends Observable{
    int i = 0;
    public void setDate(int i){
        this.i = i;
        setChanged();
        notifyObservers();
    }
}
