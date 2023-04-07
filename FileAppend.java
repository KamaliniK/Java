import java.io.FileWriter;
import java.io.IOException;
public class FileAppend {

	public static void main(String[] args) {
		FileWriter file = null;
		try {
			file = new FileWriter("C:\\Users\\owner\\hello.txt",true);
			file.append("\nHi I am appended by the user");
			file.append("\nHi I am appended by the user below the first line ");
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		finally {
			try {
				file.flush();
				file.close();
			}
			catch(IOException ie){
				ie.printStackTrace();
			}
		}

	}

}
