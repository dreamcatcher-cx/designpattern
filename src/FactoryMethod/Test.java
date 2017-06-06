package FactoryMethod;

/**
 * Created by chengxiao on 2017/3/2.
 */
public class Test {
    public static void main(String []args){
        Factory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        product.show();

    }
}
