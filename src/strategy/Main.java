package strategy;

/**
 * Created by chengxiao on 2016/12/19.
 */
public class Main {
    public static void main(String[] args) {
        Strategy s1 = new ConcreteStrategyA();
        Strategy s2 = new ConcreteStrategyB();
        Strategy s3 = new ConcreteStrategyC();
        //策略A
        Context context = new Context(s1);
        context.contextInterface();
        //策略B
        context = new Context(s2);
        context.contextInterface();
        //策略C
        context = new Context(s3);
        context.contextInterface();

    }
}
