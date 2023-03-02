import java.util.Arrays;
public class GestorFiguras {
public static double suma (Figura[]v){
double res=0;
for(Figura s:v){
    res+=s.area();
}
return res;
}
public static void sort(Figura[]v){

    Arrays.sort(v);
}
    public static void print(Figura[] v) {
        for (Figura figura : v) {
            System.out.println("La figura es "+figura.toString()+" y tiene "+ figura.area()+ " metros cuadrados");
        }
    }
    public static void main(String[] args) {
        Figura[]v= new Figura[4];

        v[0]=new Rectangle(5,3);
        v[1]=new Cercle(5);
        v[2]=new Quadrat(5);
        v[3]=new TriangleEQ(4,2);

        double res= suma (v);

        System.out.println("El resultado de la suma es "+res);

        print(v);

        sort(v);

        print(v);
    }
}