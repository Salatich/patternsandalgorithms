package salatich.factorymethod.practice;

public abstract class Application {

    abstract Document createDocument();

    public void newDocument(){
        Document document = createDocument();
        document.open();
    }

}
