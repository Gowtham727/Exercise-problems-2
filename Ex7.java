class Ex7{
    void method(int a,int b,int c)
    {
        int result=a+b+c;
        System.out.println("the perimeter of a rectangle is "+result);
    }
}
public class Main {
    public static void main(String[] args) {
        Ex7 ex7=new Ex7();
        ex7.method(5,6,7);


    }
}