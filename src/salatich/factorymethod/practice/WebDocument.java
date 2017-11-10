package salatich.factorymethod.practice;

public class WebDocument implements Document {

    @Override
    public void open() {
        System.out.println("web doc is opened");
    }

    @Override
    public void close() {

    }

    @Override
    public void save() {

    }

    @Override
    public void revert() {

    }
}
