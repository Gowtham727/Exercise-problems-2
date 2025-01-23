import java.util.*;
class Solution{
    int method(int num1,int num2)
    {
        int gcd=1;
        while (num2 != 0) {

            int remainder=num1 % num2;
            num1=num2;
            num2=remainder;

        }
       return gcd=num1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int result=solution.method(4,5);
        System.out.println("the gcd of the nos is "+result);

    }
}