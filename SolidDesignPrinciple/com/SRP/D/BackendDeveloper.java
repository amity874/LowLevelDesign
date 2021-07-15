package SolidDesignPrinciple.com.SRP.D;

public class BackendDeveloper implements Developer {
private String name;
     BackendDeveloper(String name){
        this.name=name;
    }
    @Override
    public void develop() {
        writejava();
    }
    @Override
    public void getname() {
        System.out.println(name);
    }

    public void writejava(){
        System.out.println("Writing Backend in java");
    }
}
