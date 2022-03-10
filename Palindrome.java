import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int res=0;
		while(temp>0)
		{
			res=(res*10)+temp%10;
			temp=temp/10;
			
		}
		if(res==num)
		{
			System.out.println("given number is palindrome");
			
		}
		else {
			System.out.print("not palindrome");
		}
		

	}

}
