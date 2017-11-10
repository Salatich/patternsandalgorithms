package salatich.factorymethod;

import salatich.factorymethod.practice.Application;
import salatich.factorymethod.practice.TextApplication;
import salatich.factorymethod.practice.WebApplication;

/**
 * Class: Creational pattern (Порождающий паттерн)
 * Name: Factory Method (Фабричный метод)
 * Also known as: Virtual Constructor
 * Page in Design Patterns: 107
 */
public class Main {

    public static void main(String[] args) {

        Application app = new TextApplication();
        app.newDocument();
        app = new WebApplication();
        app.newDocument();
       /* System.out.println(creator);
        System.out.println(creator.hashCode());
        System.out.println(creator.factoryMethod());
        System.out.println(creator.hashCode());*/

        //creator = new ConcreteCreatorA();
        //creator.AnOperation();

    }

}
