package qsp;

public class substring {

	public static void main(String[] args) {
      String s1="abcd";
      String s2="efhg";
      s1=s1+s2;   //  8  //s1=abcdefgh
      s2=s1.substring(0,s1.length()-s2.length());  // s2= (0,8-4)// abcd
      
      s1=s1.substring(s2.length());  //  "abcdefg"(4); 
      System.out.println(s1);  
      System.out.println(s2);  //abcd

      
	}

}
