package DesignPattern.BehaviouuralDesignPattern.observer;

public class MyBatchSubscriber implements ObserverStudent{
private String name;
private AmitSession amitSession;
public MyBatchSubscriber(String name){
    this.name=name;
}
    @Override
    public void update() {
    String sessionPlan=amitSession.getUpdate(this);
        System.out.println(this.name+" Amit Will be live at 10 minutes");
    }
    @Override
    public void setAmitSession(AmitSession amitSession) {
    this.amitSession=amitSession;
    }
    @Override
    public String getName() {
    return this.name;
    }
}
