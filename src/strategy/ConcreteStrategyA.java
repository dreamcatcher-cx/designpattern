package strategy;

/**
 * Created by chengxiao on 2016/12/19.
 * 策略A
 */
public class ConcreteStrategyA extends Strategy{
    @Override
    public void strategyInterface() {
        System.out.println("策略A");
    }
}
