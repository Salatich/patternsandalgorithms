package salatich.factorymethod.practice;

public class TextApplication extends Application {

    @Override
    Document createDocument() {
        return new TextDocument();
    }
}
