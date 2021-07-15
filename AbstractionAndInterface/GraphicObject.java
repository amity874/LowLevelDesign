package AbstractionAndInterface;

public abstract class GraphicObject {
    private int x = 10;
   protected int y = 20;
    void Moveto(int newX, int newY){
        System.out.println("Moved "+newX+" "+""+newY);
    }
    abstract void Draw();
    abstract void Resize();
}
