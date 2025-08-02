package my_project;
import java.util.*;
public class stringBuilder_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		if(str.contentEquals(sb))
			System.out.println("string is palindrome");
		else
			System.out.println("String is not a palindrome");
			
	}

}
