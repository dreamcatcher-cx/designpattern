package strategy;

/**
 * Created by chengxiao on 2016/12/19.
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void contextInterface(){
        strategy.strategyInterface();
    }}
