package java8;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class LowercaseLetters_returning {
	
	public static List<String> method(List<String> list)
	{
		 Predicate<String> start_with_a  = (Value)->Value.startsWith("a"); 
	        
	        Predicate<String> length3 = (Value)->Value.length()==3;
	        
	        List<String> result = list.stream().filter(start_with_a.and(length3)).collect(Collectors.toList());	        
	        return result;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int size,i;
		System.out.println("enter the size of an element");
		size=sc.nextInt();
		
		List<String> list = new ArrayList<String>();		
		String s1;
        for(i=0;i<size;i++)
        {
        	s1 = sc.next();
          	list.add(s1);
        }
        
       List<String> output = method(list);
        if(output.size()>1)
        {
        System.out.println("Strings are "+output);
        }
        
        else
        {
        	System.out.println("No element Found");
        }
     
        sc.close();
		
	}

}