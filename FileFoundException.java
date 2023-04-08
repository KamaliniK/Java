import java.io.File;

class FileNotPresentException extends Exception{
	public FileNotPresentException(String str) {
		super(str);
	}
}

public class FileNotPresent {
	public static void main(String[] args) {
		File file =new File("C:\\Users\\owner\\hello1.txt") ;
		
		try{
			if(file.exists() == false) 
				throw new FileNotPresentException("File Not Present!!");
			else
				System.out.println("File exists !!!");
		}
		catch(FileNotPresentException fe) {
			System.out.println("Exception occured : " + fe);
		}
		
	
		

	}

}
