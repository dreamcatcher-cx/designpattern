package FactoryMethod;

/**
 * Created by chengxiao on 2017/3/2.
 */
public class ConcreteFactoryB implements Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
