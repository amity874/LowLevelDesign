package SolidDesignPrinciple.com.SRP.D;
import javax.security.auth.login.Configuration;
import java.util.ArrayList;
import java.util.List;
public class Project {
    private List<Developer>developers;
    public  Project(){
        this.developers=new ArrayList<>();
    }
    public void register(Developer developer){
       developer.getname();
       this.developers.add(developer);
    }
}
