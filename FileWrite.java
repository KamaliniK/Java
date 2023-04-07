import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class FileWrite {

	public static void main(String[] args) {
		FileWriter file = null;
		try {
			file=new FileWriter("C:\\Users\\owner\\hello.txt");
			file.write("Hi");
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		
		finally {
			try {
				file.flush();
				file.close();
			}
			catch(IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
