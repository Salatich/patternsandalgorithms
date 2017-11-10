package salatich.factorymethod.practice;

public class TextDocument implements Document {

    @Override
    public void open() {
        System.out.println("text doc is opened");
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
