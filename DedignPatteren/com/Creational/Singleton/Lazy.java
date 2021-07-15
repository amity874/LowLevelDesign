package DedignPatteren.com.Creational.Singleton;

import javax.swing.*;

public class Lazy {
    private Lazy(){
    }
    //cause our cons is private we need to add static method here
    /*
    but our problem not totally solved here cause our instance is always ready even we cant need this
     */
    private static Lazy instance;
   static Lazy getInstance(){
        if(instance==null){
            System.out.println("New instance is created");
            instance=new Lazy();
        }
        return instance;
    }
}
