package DedignPatteren.com.Creational.Singleton.FactoryDesignpattern.AbstractFactory;

public class SportCar implements Car{
    private String steeringWheel;
    private String Mirror;
    private String Break;
    private String DiskBreak;
    private String powerSteering;
    private String Sunroof;
    public SportCar(String st, String Br, String mi, String Disk, String powerS, String sunroof){
        this.steeringWheel=st;
        this.Break=Br;
        this.Mirror=mi;
        this.DiskBreak=Disk;
        this.powerSteering=powerS;
        this.Sunroof=sunroof;
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
        return Break;
    }
    public String getDiskBreak(){
        return this.DiskBreak;
    }
    public String getPowerSteering(){
        return this.powerSteering;
    }
}
