package DedignPatteren.com.Creational.Singleton.FactoryDesignpattern.AbstractFactory;

public class BasicCar implements Car{
    private String steeringWheel;
    private String Mirror;
    private String Break;
    public BasicCar(String steeringWheel,String Mirror,String Break){
        this.Break=Break;
        this.Mirror=Mirror;
        this.steeringWheel=steeringWheel;
    }
    @Override
    public String getSteeringWheel() {
        return this.steeringWheel;
    }

    @Override
    public String getMirror() {
        return this.Mirror;
    }

    @Override
    public String getBreak() {
        return this.Break;
    }
}
