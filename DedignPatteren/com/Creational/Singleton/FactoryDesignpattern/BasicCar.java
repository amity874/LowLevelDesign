package DedignPatteren.com.Creational.Singleton.FactoryDesignpattern;

import java.lang.reflect.Constructor;

public class BasicCar implements Car{
    private String stringWheel;
    private String Break;
    private String Mirrors;
    BasicCar(String stringWheel,String Break,String Mirrors){
        this.stringWheel=stringWheel;
        this.Break=Break;
        this.Mirrors=Mirrors;
        System.out.println("Creating Basic car");
    }
    @Override
    public String getSteeringWheel(){
        return this.stringWheel;
    }

    @Override
    public String getMirrors() {
        return this.Mirrors;
    }

    @Override
    public String getBreak() {
        return this.Break;
    }
}
