public class Rectangle extends Figura{

    private double b;
    private double h;

    public Rectangle(double b,double h){

        this.b=b;
        this.h=h;
    }

    @Override
    public double area() {
        return b*h;
    }
}
