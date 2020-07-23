package java8;
import java.util.*;

import java.util.stream.IntStream;
public class Palindrome_Strings {
	
	static void checkPalindrome(String text) 
	{
		String sample  = text.replaceAll("\\s+", "").toLowerCase();
	    boolean result =  IntStream.range(0, sample.length() / 2)
	      .noneMatch(i -> sample.charAt(i) != sample.charAt(sample.length() - i - 1));
	    	 if(result)
	    	  {
	    		  System.out.println(text);
	    	  }
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int size;
		size = sc.nextInt();
		System.out.println("Enter a array of strings");
		String ps;
		for(int i = 0; i<size; i++)
		{
			ps=sc.next();
			list.add(ps);
		}
		Iterator<String> iterator = list.iterator();
	      while(iterator.hasNext()) {
	    	  checkPalindrome(iterator.next());
	 	      }
	      sc.close();
	}

}