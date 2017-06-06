package FactoryMethod;

/**
 * Created by chengxiao on 2017/3/2.
 */
public class ConcreteFactoryA implements Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
