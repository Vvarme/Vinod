
import java.util.*;
public class Printprime {
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int start=sc.nextInt();
		int N=sc.nextInt();
		System.out.println("All the prime number up to "+N+"  is:");
		for(int i=1;i<=N;i++)
		{   
			if((i==2||i==3)||i==5)
			{
				System.out.println(i);
			}
			else if(isprime(i)){
				System.out.println(i);
			
			}
		}
		
		
	}
  static boolean isprime(int num) {
	    	if(num%2!=0&&num%3!=0&&num%5!=0)
	    	{
	    		return true;
	    		
	    	}
	    	else 
	    	{
	    		return false;
	    	}
	    }
		
}