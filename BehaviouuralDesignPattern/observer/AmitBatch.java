package DesignPattern.BehaviouuralDesignPattern.observer;
import java.util.ArrayList;
import java.util.List;
public class AmitBatch implements AmitSession{
    private List<ObserverStudent> registeredStudent;
    private String studyTopic;
    public AmitBatch(){
        /**
         * In the begining  there will we no student
         */
        this.registeredStudent=new ArrayList<>();
    }
    @Override
    public void register(ObserverStudent student) {
        System.out.println("Registering student "+student.getName());
        this.registeredStudent.add(student);
    }
    @Override
    public void unregister(ObserverStudent student){
        System.out.println("Removing student :"+student.getName());
        this.registeredStudent.remove(student);
    }
    @Override
    public void notifyObservingStudent() {
        for(ObserverStudent student :registeredStudent){
            student.update();
        }
    }

    @Override
    public String getUpdate(ObserverStudent student) {
        /**
         * Check if student is enrolled for this course or not
         */
        if(registeredStudent.contains(student)){
            return this.studyTopic;
        }
        System.out.println("You need to first enroll in this course");
        return null;
    }
    public void AddStudyTopic(String studyTopic){
        System.out.println("Added the study topic :"+studyTopic);
    }
}
