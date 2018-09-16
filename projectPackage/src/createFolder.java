import java.io.File;


public class createFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileArray[] = {new File("D://Maven//"), new File("D://Maven//src//"),
				new File("D://Maven//src//main//"),new File("D://Maven//src//test//"),
				new File("D://Maven//src//main//java//"),new File("D://Maven//src//main//resources"),
				new File("D://Maven//src//test//java//"),new File("D://Maven//src//test//resources"),
				new File("D://Maven//src//target//")};
		
for (int i = 0; i<fileArray.length; i++) {
		// if the directory does not exist, create it
		if (!fileArray[i].exists()) {
		    System.out.println("creating directory: " + fileArray[i].getName());
		    boolean result = false;

		    try{
		    	fileArray[i].mkdir();
		        result = true;
		    } 
		    catch(SecurityException se){
		        //handle it
		    }        
		    if(result) {    
		        System.out.println("DIR created");  
		    }
		}
	}

}

}