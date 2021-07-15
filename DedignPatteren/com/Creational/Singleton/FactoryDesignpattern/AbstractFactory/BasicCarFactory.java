package DedignPatteren.com.Creational.Singleton.FactoryDesignpattern.AbstractFactory;

public class BasicCarFactory implements CarAbstractFactory{
    private String SteeringWheel;
    private String Mirror;
    private String Break;
    public BasicCarFactory(String streeingwheel,String mirror,String Break){
        this.SteeringWheel=streeingwheel;
        this.Break=Break;
        this.Mirror=mirror;
    }
    @Override
    public Car createCar() {
        System.out.println("Inside Basic car factory ");
        return new BasicCar(SteeringWheel,Mirror,Break);
    }
}
