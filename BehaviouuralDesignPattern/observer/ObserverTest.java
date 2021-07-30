package DesignPattern.BehaviouuralDesignPattern.observer;

import javax.swing.plaf.multi.MultiMenuBarUI;

public class ObserverTest {
    public static void main(String[] args) {
        /**
         * Amit has to create a batch
         */
        AmitBatch batch=new AmitBatch();
        /**
         * Students should be created
         */
        ObserverStudent s1=new MyBatchSubscriber("Sonia");
        ObserverStudent s2=new MyBatchSubscriber("Rahul");
        ObserverStudent s3=new MyBatchSubscriber("Shivam");
        ObserverStudent s4=new MyBatchSubscriber("Jaynta");
        batch.register(s1);
        batch.register(s2);
        batch.register(s3);
        batch.register(s4);
        s1.setAmitSession(batch);
        s2.setAmitSession(batch);
        s3.setAmitSession(batch);
        s4.setAmitSession(batch);
        s1.update();
        s2.update();
        s3.update();
        s4.update();
        batch.AddStudyTopic("Low level design");
    }
}
