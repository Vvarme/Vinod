
import java.util.*;
import java.util.Arrays;
 public class welcomeclass {
         public static void main(String[] args) {
		      Scanner sc=new Scanner(System.in);
		       System.out.println("Enter first String");
		       String str1=sc.nextLine();
		        System.out.println("Enetr second String");
		         String str2=sc.nextLine();
		         if(str1.length()!=str2.length())
		         {
		        	 System.out.println("both strings are not anagram");
		        	 
		         }
		          str1=str1.toLowerCase();
		          str2=str2.toLowerCase();
		           char[] fstring=str1.toCharArray();
		           char[]sstring=str2.toCharArray();
		         Arrays.sort(fstring);
		         Arrays.sort(sstring);
		         
		         if(Arrays.equals(fstring,sstring))
		         {
		        	 System.out.println("Both strings are anagram");
		         }
		          else {
		        	 System.out.print("Not anagram");
		          }
		         
			}

		}

	}

}
