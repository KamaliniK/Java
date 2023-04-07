import java.io.File;
import java.io.FileWriter;
public class FileDelete {

	public static void main(String[] args) {
		File file =new File("C:\\Users\\owner\\hello1.txt");
		if(file.delete()) 
			System.out.println("File Deletion succesfull");
		else
			System.out.println("File Deletion Unsuccesfull");
			
	}

}
