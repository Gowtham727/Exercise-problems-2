import java.util.*;
class Solution{
    int result=0;
    int method(int n)
    {
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
              result=result+i;
            }
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution sol=new Solution();
        System.out.println("enter the no:");
        int n=scan.nextInt();
        int ans=sol.method(n);
        if(ans==n)
        {
            System.out.println("the no is a perfect no "+n);
        }
        else
            System.out.println("the no is not a perfect no "+n);

    }

    }
