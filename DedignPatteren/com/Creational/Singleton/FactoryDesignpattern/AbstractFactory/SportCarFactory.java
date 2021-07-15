package DedignPatteren.com.Creational.Singleton.FactoryDesignpattern.AbstractFactory;

public class SportCarFactory implements CarAbstractFactory{
    private String steeringWheel;
    private String Mirror;
    private String Break;
    private String DiskBreak;
    private String powerSteering;
    private String Sunroof;
    public SportCarFactory(String steeringWheel, String brakes, String mirrors,String db,String ps,String sun) {
        this.steeringWheel = steeringWheel;
        this.Break = brakes;
        this.Mirror = mirrors;
        this.DiskBreak=db;
       this.powerSteering=ps;
       this.Sunroof=sun;
    }
    @Override
    public Car createCar() {
        System.out.println("Inside Sport car factory ");
        return new SportCar(steeringWheel,Mirror,Break,DiskBreak,powerSteering,Sunroof);
    }
}
