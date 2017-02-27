package decorator;

/**
 * Created by chengxiao on 2017/2/27.
 */
public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
