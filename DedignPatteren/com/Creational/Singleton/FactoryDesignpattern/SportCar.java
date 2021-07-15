package DedignPatteren.com.Creational.Singleton.FactoryDesignpattern;

import javax.print.attribute.standard.PrinterURI;
import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class SportCar implements Car{
    private  String StringWheel;
    private String Break;
    private String Mirror;
    public SportCar(String StringWheel,String Break,String Mirror){
        this.StringWheel=StringWheel;
        this.Break=Break;
        this.Mirror=Mirror;
        System.out.println("Creating Sport car");
    }
    @Override
    public String getSteeringWheel() {
        return null;
    }

    @Override
    public String getMirrors() {
        return null;
    }

    @Override
    public String getBreak() {
        return null;
    }
}
