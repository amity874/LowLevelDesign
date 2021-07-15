package SolidDesignPrinciple.com.SRP.O;

public class Dog implements Animal{

    @Override
    public void FeedAnimal() {
        System.out.println("Dog is eating");
    }

    @Override
    public void ShowerAnimal() {
        System.out.println("Dog is Bathing");
    }
}
