package Interface;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Bicycle {

    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
        System.out.println("Setting Cadence rate is"+newValue);
    }

    public void setGear(int newValue) {
        gear = newValue;
        System.out.println("Setting Gear "+newValue);
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        System.out.println("Speed decreasing by "+decrement);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Current speed is "+speed);
    }
    public void showspeed(){
        System.out.println("Current speed is "+speed);
    }
}
