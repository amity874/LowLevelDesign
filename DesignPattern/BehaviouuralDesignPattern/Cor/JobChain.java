package DesignPattern.BehaviouuralDesignPattern.Cor;

public interface JobChain {
    /**
     * Setting the next job
     * @param jobChain
     */
    public void SetnextChain(JobChain jobChain);

    /**
     * Help person get job
     * 1. FAANG
     * 2. PRODUCT
     * 3. SERVICE
     * @param person
     */
    public void Getjob(Person person);
}
