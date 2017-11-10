package salatich.factorymethod;

/**
 * Implements the Product interface
 * See @ConcreteProduct in book
 */
public class ConcreteProductB implements Product {

    @Override
    public void doSomething() {
        System.out.println("I belong to ConcreteProductB!");

    }
}
