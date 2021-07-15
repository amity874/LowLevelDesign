package DedignPatteren.com.Creational.Singleton.FactoryDesignpattern;

public class CarFactory {
    public static Car CreateCar(String SteeringWheel,String Break,String Mirrors,String typeofcar){
        if(typeofcar.equals("Basic")){
            return new BasicCar(SteeringWheel,Break,Mirrors);
        }
        else if(typeofcar.equals("Sport")){
            return new SportCar(SteeringWheel,Break,Mirrors);
        }
        else {
            throw new RuntimeException("This type of car currently not supported");
        }
    }
}
