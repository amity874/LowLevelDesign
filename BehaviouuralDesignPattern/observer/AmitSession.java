package DesignPattern.BehaviouuralDesignPattern.observer;
public interface AmitSession {
    /**
     * Method to allow student registration
     */
    public void register(ObserverStudent student);
    /**
     * Method to unregister from my batch
     */
    public void unregister(ObserverStudent student);
    /**
     * Notify all the student about the class
     */
    public void notifyObservingStudent();
    /**
     * student can themself call and ask about the session
     */
    public String getUpdate (ObserverStudent student);
}
