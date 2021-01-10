public class Triagle extends Figure{
    double dim3;
    Triagle(double a, double b, double c){
        super(a,b);
        dim3=c;
    }

    @Override
    public double area(){
        double p=(dim1+dim2+dim3)/2;
        return (Math.sqrt(p*(p-dim1)*(p-dim2)*(p-dim3)))
    }
}
