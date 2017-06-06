package state;

/**
 * Created by chengxiao on 2017/6/5.
 * 上下文环境，它定义了客户程序需要的接口并维护一个具体状态角色的实例，将与状态相关的操作
 * 委托给当前的Concrete State对象来处理
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void request(){
        this.state.handle(this);
    }
}
