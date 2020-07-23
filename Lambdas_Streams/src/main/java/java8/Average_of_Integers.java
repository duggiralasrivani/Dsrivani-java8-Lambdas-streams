package java8;
import java.util.*;
public class Average_of_Integers {

	public static void main(String[] args) {
		
		System.out.println("Enter no of elements");
		Scanner sc = new Scanner(System.in);
		int size,i,element;
		size= sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>(); 
		
		for(i=0;i<size;i++)
		{
			System.out.println("enter "+i+ "the element");
			element = sc.nextInt();
			list.add(element);
		}
		
		OptionalDouble result = list.stream().mapToInt(x->x).average();
		System.out.println("Average of list of intergers are"+result);
		sc.close();
		
		
	}
}


