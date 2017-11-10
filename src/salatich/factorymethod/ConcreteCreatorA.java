package salatich.factorymethod;

/**
 * Overrides the factory method to return an instance of a Concrete class.
 */
public class ConcreteCreatorA extends Creator {

    @Override
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}
