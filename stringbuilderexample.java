package my_project;
import java.util.*;
public class stringbuilderexample{

	public static void main(String args[]) {
		
		StringBuilder sb2=new StringBuilder();
		StringBuilder sb1 = new StringBuilder("this is klh");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        Stirng str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.append(" Hello");
 		System.out.println(sb);
        		System.out.println(sb.insert(3, "hello"));
        		System.out.println(sb1.reverse());
        		System.out.println(sb1.reverse());
        		System.out.println(sb1.replace(1,6,"java"));
        		System.out.println(sb.delete(5,10));
        		System.out.println(sb.capacity());
        		System.out.println(sb2.capacity());
        		
        		
	}

}
