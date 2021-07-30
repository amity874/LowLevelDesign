package DesignPattern.BehaviouuralDesignPattern.observer;

public interface ObserverStudent {
    /**
     * this method is used to update the student
     */
    public void update();
    /**
     * Make this student aware that he has to take this session
     */
    public void setAmitSession(AmitSession amitSession);
    public  String getName();
}
