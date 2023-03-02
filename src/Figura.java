public abstract class Figura implements Comparable<Figura> {

    public abstract double area();

    public int compareTo(Figura f){
        int res;
        res=Double.compare(this.area(),f.area());
        return res;
    }
    public String toString() {
        return getClass().getName();
    }
}
