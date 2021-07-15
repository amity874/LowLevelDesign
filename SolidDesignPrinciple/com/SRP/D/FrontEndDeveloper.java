package SolidDesignPrinciple.com.SRP.D;

public class FrontEndDeveloper implements Developer{
    private  String name;
    FrontEndDeveloper(String name){
        this.name=name;
    }
    @Override
    public void develop() {
        writejavaScript();
    }
    @Override
    public void getname() {
        System.out.println(name);
    }

    public void writejavaScript(){
        System.out.println("Writing FrontEnd in javascript");
    }
}
