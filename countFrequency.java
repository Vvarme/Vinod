import java.util.*;
public class countFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		countFrequency f=new countFrequency();
	     char[]b=str.toCharArray();
	     f.frequency(b);

	}
	public void frequency(char[]a)
	{
		int freq=1,c=1;
		int i=a[0];
		while(c<a.length-1) {
			if(a[c-1]==a[0])
			{
				freq++;
				c++;
			} 
		else {
		System.out.println(i+"  "+freq);
		i=a[c];
		freq=1;
		}
		
			
		}
	 
	
	}

}
