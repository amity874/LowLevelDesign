package SolidDesignPrinciple.com.SRP.O;
public class Load {
    public static void main(String[] args) {
        Dog d=new Dog();
        Showeranimal s=new Showeranimal();
        s.ShoweranimaL(d);
        AnimalFeeder af=new AnimalFeeder();
        af.feedAnimal(d);
        Cat t=new Cat();
        t.ShowerAnimal();
        af.feedAnimal(t);
    }
}
