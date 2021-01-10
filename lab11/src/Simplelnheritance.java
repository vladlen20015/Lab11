public class Simplelnheritance {
    public static void main(String[] args){
        ClassA a= new ClassA();
        a.i=10;
        a.j=20;
        a.showIJ();

        ClassB b=new ClassB();
        b.i=7;
        b.j=10;
        b.k=15;
        b.showIJ();
        b.showK();
        b.sum();
}
