public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void resize(int percent){
        this.radius=percent*radius*0.01;
    }
}
