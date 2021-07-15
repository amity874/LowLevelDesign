package DedignPatteren.com.Creational.Singleton.FactoryDesignpattern.AbstractFactory;

public class MainCarFactory {
    public static void main(String[] args) {
        Car basiccar=Carfactory.getcar(new BasicCarFactory("St","M","Db"));
        Car sport=Carfactory.getcar(new SportCarFactory("st","DB","Mi","sm","yes","yes"));
    }
}
