import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileCr {

	public static void main(String[] args) throws IOException {
      String path= "E:\\localfile\\";
      Scanner sc = new Scanner (System.in);
      ArrayList<String> al=new ArrayList<>();
      while(true) {
     System.out.println(" Enter Your Choice 1.Add 2.Delete 3.Search 4.Exit");
     int choice=sc.nextInt();
        switch (choice) {
     case 1: {
    	 System.out.println("Enter the file name:");
         String filename=sc.next();
         String finalfile=path+filename;
         File f=new File(finalfile);
         boolean res=f.createNewFile();
         if (res==false) {
       	  System.out.println("File not created:");
         }
         else {
        	 al.add(filename);
       	  System.out.println("File is created:");
         }
     }
     break;
     case 2: {
    	 System.out.println("Enter the file name:");
    		String filedel=sc.next();
    		String finalfile=path+filedel;
    		File f=new File(finalfile);
    		f.delete();
    		System.out.println("File is deleted:");

     }
     break;
     case 3: {
    	 File f1=new File(path);
    	 System.out.println("Enter the file name:");
    	 String filesearch=sc.next();
    	 File filen[]= f1.listFiles();
    	 int flag=0;
    	 for (File ff:filen) {
    		 if (ff.getName().equals(filesearch)) {
    			 flag=1;
    			 break;
    		 }
    		 else {
    			 flag=0;
    		 }
    	 }
    	 if(flag==1) {
    		 System.out.println("File is found:");
    	 }
    	 else {
    		 System.out.println("File is not found:");
    	 }
     }
     break;
     case 4:System.exit(0);
     break;
     default : {
    	 System.out.println("This is not a valid Menu Option! Please Select Another.");
     }
    break;	 
     }
      
      

	}

}
}
