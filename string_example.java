package my_project;

public class string_example {
	public static void main(String args[])
	{
		String str = "hello this is java class";
		String  str1 = "hello";
		String str2  = "HELLO";
		String str3 = "hi how are you";
		String str4 = "hello";
		String str5 = "1234";
		String str6 = "Java234";
		String str7 =  "";
		String str8 = "    hello java    ";
		System.out.println(str.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str3.charAt(7));
		System.out.println(str4.length());
		System.out.println(str5.toUpperCase());
		System.out.println(str6.toLowerCase());
		System.out.println(str7.length());
		System.out.println(str8.charAt(9));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.concat(str3));
		System.out.println(str1.contains("ell"));
		System.out.println(str1.contentEquals(str4));
		System.out.println(str1.endsWith("llo"));
		System.out.println(str1.equals(str3));
		System.out.println(str1.indexOf("o"));
		System.out.println(str1.matches("[a-o]+"));
		System.out.println(str5.matches("[0-9]+"));  //System.out.println(str5.matches("\\d+")); --> this line is also for digit
		System.out.println(str6.matches("[a-zA-Z0-9]+"));//	System.out.println(str6.matches("[a-zA-Z]+\\d+")); --> this line of code cam also be used
		System.out.println(str1.isEmpty());
		System.out.println(str7.isEmpty());
		System.out.println(String.join("|" ,str1,str2,str3,str4,str5,str6,str7,str8));
		System.out.println(str1.lastIndexOf('l'));
		System.out.println(str1.replace('l','p' ));
		System.out.println(str1.replaceFirst("hel","tro"));
		String str10 = "hi;how;are;you";
		String str8[]=str10.split(";");
		for (String i:str8)
		{
			System.out.println(i);
		}
		System.out.println(str6.startsWith("J"));
		
		
		
	}

}
