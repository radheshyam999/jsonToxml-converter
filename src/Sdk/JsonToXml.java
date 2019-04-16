package Sdk;
import java.io.*;
import java.io.File;
import java.lang.String;

public class JsonToXml{
	
	String ReaderPathofile = "E:\\programe\\www\\javascriptproject\\ListOfCountryCode\\js\\code.json";
	
   String Writepathfile ="C:\\Users\\ADMIN\\Desktop\\TextFile\\xml\\ls.txt";

    
      void ReadDatafrom_Json_file () throws IOException {
	//JsonToXml AcessMethod = new JsonToXml();
	
		   String rootName,subRootName;

		 

		 BufferedReader red = new BufferedReader (new InputStreamReader (System.in));

		 
	    System.out.println("Pleas write your path for Reading Data:  ");
	
	     ReaderPathofile = red.readLine();
			
			 ReaderPathofile=  ReaderPathofile.replace ("\\","\\\\");
				
			 System.out.println("what  file adress" + ReaderPathofile);
				
				Writepathfile = red.readLine();
				
				Writepathfile=   Writepathfile.replace("\\","\\\\");
				
				File checkfile = new File (ReaderPathofile);
	      
	      FileReader readFileFile = new FileReader(ReaderPathofile);
	      
	      FileWriter WriteFileInxml = new FileWriter(Writepathfile);
	
         BufferedReader ReadFile = new BufferedReader (readFileFile);
		 
		     PrintWriter WriteitInfile = new PrintWriter(WriteFileInxml);
	     // ReadFile.replace();
	      System.out.print ("pleas Enter  your xml file root name ");
	      rootName = red.readLine ();
	      System.out .print ("pleas Enter your subroot Name");
	      subRootName = red.readLine ();
	//if(checkfile.exists ()){
	 
			String DataformJsonfile = ReadFile.readLine();

			while (DataformJsonfile != null) {
				WriteitInfile.println(DataformJsonfile);
				DataformJsonfile = DataformJsonfile.replace(":" , "<" + ">");  // here replacing  [ to <>
			 
				DataformJsonfile = DataformJsonfile.replace("[", "<" +rootName+ ">");  // here replacing  [ to <>
				
  			    DataformJsonfile = DataformJsonfile.replace("]", "</"+rootName + ">"); // here replacing  ] to </>

				DataformJsonfile= DataformJsonfile.replace ("{" ,"<"+subRootName+">");  // here replacing  { to <>
				
				DataformJsonfile= DataformJsonfile.replace ("}" ,"</"+subRootName+">");  //// here replacing  } to </>
				
				System.out.println(DataformJsonfile);

				DataformJsonfile = ReadFile.readLine();

			}
	//}
	//else{
		//System.out.println("Your Number Is Not Avaliable");
	//}
	    
	
      WriteFileInxml.flush();

		  ReadFile.close();
		
	     WriteFileInxml.close();
	
	
	
}


}