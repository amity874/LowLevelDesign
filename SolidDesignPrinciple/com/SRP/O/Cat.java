package SolidDesignPrinciple.com.SRP.O;

public class Cat implements Animal{
    @Override
    public void FeedAnimal() {
        System.out.println("Cat in eating");
    }

    @Override
    public void ShowerAnimal() {
        System.out.println("Cat is Bathing");
    }
}
