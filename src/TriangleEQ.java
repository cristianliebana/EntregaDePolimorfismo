public class TriangleEQ extends Figura {

    private double b;
    private double h;

    public TriangleEQ(double b,double h){

        this.b=b;
        this.h=h;
    }

    @Override
    public double area() {
        return (b*h)/2;
    }

}
