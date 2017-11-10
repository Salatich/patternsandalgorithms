package salatich.factorymethod;

/**
 * Declares the factory method, which returns an object of type Product.
 * May call the factory method to create a Product object
 */
public abstract class Creator {

    public void AnOperation(){
        Product product = factoryMethod();
        product.doSomething();
    }

    /**
     * Factory Method.
     * @return Product object.
     */
     abstract Product factoryMethod();
}
