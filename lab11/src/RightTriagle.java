public class RightTriagle extends Figure {
    RightTriagle(double a, double b){
        super(a,b);
    }
    @Override
    public double area(){
        return (dim1*dim2/2);
    }
}

