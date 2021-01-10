abstract class Figure implements {
    public double area(){return (dim1*dim2);}
    @Override
    public double calcP(){ return 1;
    }
}

class RightTriagle extends Figure {
    RightTriagle(double a, double b){
        super(a,b);
    }
    @Override
    public double area(){
        return (dim1*dim2/2);
    }
}

class Triagle extends Figure {
    double dim3;

    Triagle(double a, double b, double c) {
        super(a, b);
        dim3 = c;
    }

    @Override
    public double area() {
        double p = (dim1 + dim2 + dim3) / 2;
        return (Math.sqrt(p * (p - dim1) * (p - dim2) * (p - dim3)))
    }
}

public class TestFigure {
    public static void main(String[] args){
        Reactagle reactagle= new Reactagle(2,6);
        RightTriagle rightTriagle= new RightTriagle(3,4);
        Triagle triagle= new Triagle(5,6,4);

        System.out.println(reactagle.area());
        System.out.println(rightTriagle.area());
        System.out.println(triagle.area());



