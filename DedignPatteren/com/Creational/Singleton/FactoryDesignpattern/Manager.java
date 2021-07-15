package DedignPatteren.com.Creational.Singleton.FactoryDesignpattern;

public class Manager {
    public static void main(String[] args) {
        Car basicCar=CarFactory.CreateCar("Normal Steering","DiskBreak","Convex","Basic");
        Car sportcar=CarFactory.CreateCar("Power Steering","Power Diskbreak","Convex concave","Sport");
    }
}
