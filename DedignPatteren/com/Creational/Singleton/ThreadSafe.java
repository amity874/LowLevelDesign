package DedignPatteren.com.Creational.Singleton;

public class ThreadSafe{
    private ThreadSafe(){};
    private  static ThreadSafe instance;
    public static synchronized ThreadSafe getInstance(){
        if (instance==null){
            instance=new ThreadSafe();
            System.out.println("Created new instance via synchronization");
        }
        return instance;
    }
}
