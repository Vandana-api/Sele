package VANDANA;

import java.io.IOException;

public class demogenericlib {
	
	public static void main(String[] args) throws IOException  {
		
		FILELIB f=new FILELIB();
		 String url = f.getPropertyData("url");
		System.out.println(url);
		      String en = f.getExcelData("create", 1, 2);
		      
		      f.setExcelData("create", 1, 3,"nnnn");
		
	}

}
