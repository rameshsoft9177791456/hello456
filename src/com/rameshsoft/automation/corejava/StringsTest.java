package com.rameshsoft.automation.corejava;

public class StringsTest {
public static void main(String[] args) {
	
	String str = "java selenium do hardwork job";
	
	
	String[] str1 = str.split(" ");
	
	for(String str2 : str1)
	{
		System.out.println(str2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*String str = "java456";
	
	int sum = 0; //15
	
	char[] ch = str.toCharArray();
	
	for(char ch1 : ch)
	{
		if (Character.isDigit(ch1)) {
			int val = Character.getNumericValue(ch1);
			sum = sum + val; //9 + 6
		}
	}
	
	System.out.println("SUM IS: "+sum);
	
	*/
	
	/*for(int i=str.length()-1; i>=0; i--)
	{
		char ch = str.charAt(i);
		reverse = reverse + ch; //"ava" + j
	}
	
	System.out.println(reverse);
	*/
	
	
	/*StringBuffer sb = new StringBuffer(str);
	StringBuffer sb1 = sb.reverse();
	
	System.out.println("Before reverse: "+str);
	System.out.println("After reverse: "+sb1);
	*/
	
	/*String str = "ja va selenium ";
	String str1 = str.toLowerCase();
	char ch = str.charAt(3);
	
	String str2 = str.toUpperCase();
	
	String str3 = str.trim();
	
	String str4 = str.substring(2);
	
	String str5 = str.substring(2, 6);
	
	char[] ch = str.toCharArray();
	
	String[] str6 = str.split(" ");
	for(String str7 : str6)
	{
		System.out.println(str7);
	}
	
	
	String str8 = str.replace('s', 't');
	
	String str9 = str.replace("java", "selenium");
	
	str.replaceFirst("a", "j");
	
	*/
	
	/*StringBuffer sb1 = new StringBuffer("Java");
	StringBuffer sb2 = sb1.append("job");
	
	System.out.println(sb1);
	System.out.println(sb2);
	
	System.out.println(sb1.hashCode());
	System.out.println(sb2.hashCode());
	
	if (sb1 == sb2) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not equal");
	}
	*/
	
	/*String str = "job";
	
	String str1 = str.concat("java");
	
	System.out.println(str);
	System.out.println(str.toString());
	
	System.out.println(str1);
	System.out.println(str1.toString());
	
	System.out.println(str.hashCode());
	System.out.println(str1.hashCode());
	
	if (str == str1) {
		System.out.println("equal");
	}
	else {
		System.out.println("not equal");
	}
	*/
	
	
	
	
	
	
	
	
	
	
}
}
