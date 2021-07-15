package DedignPatteren.com.Creational.Singleton.Builder;

import com.sun.jdi.Mirror;

import java.net.CacheRequest;

public class Car {
    /*
    Mandatory attributes
     */
    private String SteeringWheel;
    private String Mirror;
    private String Break;
    /*
    Optional attributes
     */
    private String ac;
    private String MusicSystem;
    private String seatcover;

    public Car(Carbuilder car) {
        this.SteeringWheel=car.SteeringWheel;
        this.Break=car.Break;
        this.Mirror=car.Mirror;
        this.ac=car.ac;
        this.MusicSystem=car.MusicSystem;
        this.seatcover=car.seatcover;
    }

    @Override
    public String toString() {
        return "Car{" +
                "SteeringWheel='" + SteeringWheel + '\'' +
                ", Mirror='" + Mirror + '\'' +
                ", Break='" + Break + '\'' +
                ", ac='" + ac + '\'' +
                ", MusicSystem='" + MusicSystem + '\'' +
                ", seatcover='" + seatcover + '\'' +
                '}';
    }

    public static class Carbuilder{
        /*
    Mandatory attributes
     */
        private String SteeringWheel;
        private String Mirror;
        private String Break;
        /*
        Optional attributes
         */
        private String ac;
        private String MusicSystem;
        private String seatcover;

        public Carbuilder(String steeringWheel, String Mirror, String aBreak) {
            this.SteeringWheel = steeringWheel;
            this.Mirror = Mirror;
            this.Break = aBreak;
        }
        public Carbuilder setAc(String ac){
            this.ac=ac;
            return this;
        }
        public Carbuilder setMusicSystem(String music){
            this.MusicSystem=music;
            return this;
        }
        public Carbuilder setseatcover(String seatcover){
            this.seatcover=seatcover;
            return this;
        }
        /**
         * This method will be used for creating the object
         * @return
         */
        public Car build(){
            return new Car(this);
        }
    }
}