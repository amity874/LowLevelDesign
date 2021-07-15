package DedignPatteren.com.Creational.Singleton.FactoryDesignpattern.AbstractFactory;

public class Carfactory {
    public static Car getcar(CarAbstractFactory carfactory){
        return carfactory.createCar();
    }
}
