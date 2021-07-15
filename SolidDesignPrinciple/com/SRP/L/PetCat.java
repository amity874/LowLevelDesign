package SolidDesignPrinciple.com.SRP.L;

public class PetCat implements LivingCat {
    @Override
    public void drinkMilk() {
        System.out.println("Cat is drinking milk");
    }

    @Override
    public void speak() {
        System.out.println("Meo!!!!Meo");
    }
}
