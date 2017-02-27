package decorator;

/**
 * Created by chengxiao on 2017/2/27.
 * 装饰者抽象类
 */
public abstract class Decorator extends Component{
    private Component component;
    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
