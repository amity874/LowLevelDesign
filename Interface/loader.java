package Interface;
import java.util.ServiceLoader;
public class loader {
    public static void main(String[] args) {
        MountainBicycle b=new MountainBicycle(10,22,30,1);
        Bicycle b1=new Bicycle(12,4,55);
        b.setHeight(13);
        b.applyBrake(2);
        b.setGear(2);
        b.speedUp(4);
        b.showspeed();
        Object obj=new MountainBicycle(3,5,6,7);
        MountainBicycle c=(MountainBicycle) obj;
        ((MountainBicycle) obj).applyBrake(1);
        ((MountainBicycle) obj).showspeed();
        ((MountainBicycle) obj).setHeight(3);
        ((MountainBicycle) obj).setCadence(3);
    }
}
