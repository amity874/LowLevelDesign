package AbstractionAndInterface;

import java.awt.desktop.SystemEventListener;

public class Circle extends GraphicObject {

    @Override
    public void Draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public void Resize() {
        System.out.println("Resized by 2 radios");
    }
}
