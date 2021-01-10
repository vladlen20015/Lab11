public class Reactagle extends Figure{
    Reactagle(double a, double b){
        super(a,b);
    }
    @Override
    public double area(){return (dim1*dim2);}
    @Override
    public double calcP(){
        return 1;
    }
}

