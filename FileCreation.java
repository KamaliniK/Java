import java.io.File;
import java.io.IOException;
public class FileCreation {

	public static void main(String[] args) {
		File file=null;
		try {
			file=new File("C:\\Users\\owner\\hello.txt");
			file=new File("C:\\Users\\owner\\hello1.txt");
			if(file.createNewFile()) 
				System.out.println("File creation Succesfull!!");
			else
				System.out.println("File Creation Unsuccesfull!!!");
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}

	}

}
