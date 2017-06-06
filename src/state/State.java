package state;

/**
 * Created by chengxiao on 2017/6/5.
 * 定义一个接口以封装使用上下文环境的的一个特定状态相关的行为。
 */
public interface State {
    void handle(Context context);
}
