package Interface;
import javax.swing.plaf.synth.SynthTextAreaUI;
public class MountainBicycle extends Bicycle{
    public  int seatHeight;
    public MountainBicycle(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight=startHeight;
    }
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
        System.out.println("Now in mountain seat height is "+newValue);
    }
}
