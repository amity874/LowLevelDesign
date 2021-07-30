package DesignPattern.BehaviouuralDesignPattern.cor;

public class JobOrientationProgram {
    public static void main(String[] args) {
        FaangJob faangJob=new FaangJob();
        ProductBase productBase=new ProductBase();
        ServiceBased serviceBased=new ServiceBased();
        faangJob.SetnextChain(productBase);
        productBase.SetnextChain(serviceBased);
        Person p1=new Person("S");
        faangJob.Getjob(p1);
    }
}
