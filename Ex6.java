class Ex6{
    double value=0;
     double result=0;
    void method(int sides,double apothem,double sidelength)
    {
         value=  (0.5*sides*sidelength*apothem);
        System.out.println("the area of the regular polygon is : "+value);
    }
    void method(int sides,double sidelength)
    {
         result=(sides*Math.pow(sidelength,2))/(4*Math.PI/sides);
        System.out.println("the are of the regular polygon is "+result);

    }

}
public class Main {
    public static void main(String[] args) {
        Ex6 ex6=new Ex6();
        int sides=5;
        double sidelength=5.0;
        double apothem=6.33;
        ex6.method(sides,sidelength,apothem);
        ex6.method(sides,sidelength);

    }

}