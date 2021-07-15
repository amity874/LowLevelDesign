package DesignPattern.BehaviouuralDesignPattern.Cor;

public class ProductBase implements JobChain{
private JobChain jobChain;
    @Override
    public void SetnextChain(JobChain jobChain) {
       this.jobChain=jobChain;
    }
    @Override
    public void Getjob(Person person) {
        if(person.getSkilltype().equals("P")){
            System.out.println("Got selected in ProductBase");
        }
        else {
            System.out.println("Got rejected in Product based company");
            System.out.println("Applying for Service Base");
            this.jobChain.Getjob(person);
        }
    }
}
