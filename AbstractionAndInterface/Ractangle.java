package AbstractionAndInterface;

public class Ractangle extends GraphicObject {
    @Override
    public void Draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public void Resize() {
        System.out.println("Resized 4 cm");
    }
}
