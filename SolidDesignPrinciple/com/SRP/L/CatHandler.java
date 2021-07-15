package SolidDesignPrinciple.com.SRP.L;

public class CatHandler {
    public static void main(String[] args) {
        MechanicalCat cat=new Toycat();
        cat.speak();
        LivingCat c=new PetCat();
        c.drinkMilk();
        c.speak();
    }
}
