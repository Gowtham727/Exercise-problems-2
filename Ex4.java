package exercisee_problems2;
class Demo{
	int  method(int a,int b)
	{
		return(a>b)?a:b;
	}
			
		
}
public class Ex4 {
	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println(demo.method(10,20));
		

	}

}
