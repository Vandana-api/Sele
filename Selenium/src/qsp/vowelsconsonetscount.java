package qsp;

import java.util.Scanner;

public class vowelsconsonetscount {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a string");
     String s=sc.nextLine();
     
     int vowel=0;   int consonent=0;  String vowel1="";   String consonent1="";
      
     for (int i=0;i<s.length();i++) {
    	 char ch=s.charAt(i);
    	 if(ch>='a'&& ch<='z'|| ch>='A'&&ch<='Z')
    	 {
    		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
    			 vowel++;
    			 vowel1=vowel1+ch;
    		 }
    			 else {
    				 consonent++;
    				 consonent1=consonent1+ch;
    			 }
    			 
    		 
    	 }
     }
     System.out.println(vowel +"     "+vowel1 );
     
     System.out.println(consonent +"     "+consonent1 );
     
	}

}
