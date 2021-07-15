package SolidDesignPrinciple.com.SRP;

public class EmployeeRefactor {
    private int id;
    private String name;
    private String doj;
    private  int salary;
    public EmployeeRefactor(int id,String name,String doj,int salary){
        this.id=id;
        this.name=name;
        this.doj=doj;
        this.salary=salary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoj() {
        return doj;
    }
    public int getSalary(){
        return salary;
    }
    public void setDoj(String doj) {
        this.doj = doj;
    }
}
