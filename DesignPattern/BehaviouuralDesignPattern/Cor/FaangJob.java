package DesignPattern.BehaviouuralDesignPattern.Cor;

public class FaangJob implements JobChain{
private JobChain jobchain;
    @Override
    public void SetnextChain(JobChain jobChain){
        this.jobchain=jobChain;
    }
    @Override
    public void Getjob(Person person) {
        if(person.getSkilltype().equals("F")){
            System.out.println("got selected in Faang");
        }
        else {
            System.out.println("got rejected in faang");
            System.out.println("Applying for product base ");
            this.jobchain.Getjob(person);
        }
    }
}
