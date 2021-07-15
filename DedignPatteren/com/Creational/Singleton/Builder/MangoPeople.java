package DedignPatteren.com.Creational.Singleton.Builder;
public class MangoPeople {
    public static void main(String[] args) {
        Car car=new Car.Carbuilder("Iron","Covex","Disk").build();
        System.out.println(car);
        Car car2=new Car.Carbuilder("Iron1","Convex,Concave","Disk,Power").setMusicSystem("Sony").setAc("Hitachi").setseatcover("Leather").build();
        System.out.println(car2);
    }
}
