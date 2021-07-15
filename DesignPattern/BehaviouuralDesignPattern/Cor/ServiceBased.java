package DesignPattern.BehaviouuralDesignPattern.Cor;

public class ServiceBased implements JobChain{
private JobChain jobChain;
    @Override
    public void SetnextChain(JobChain jobChain) {
        this.jobChain=jobChain;
    }
    @Override
    public void Getjob(Person person) {
        if(person.getSkilltype().equals("S")){
            System.out.println("Got selected in Service base");
        }
        else {
            System.out.println("got rejected in Service based company also");
            System.out.println("Need to prepare more");
        }
    }
}
