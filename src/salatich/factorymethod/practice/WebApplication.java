package salatich.factorymethod.practice;

public class WebApplication extends Application {

    @Override
    Document createDocument() {
        return new WebDocument();
    }
}
