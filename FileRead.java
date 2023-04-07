import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileRead {

	public static void main(String[] args) {
		File file = null;
		Scanner read =null;
		String data="";
		try {
			file = new File("C:\\Users\\owner\\hello.txt");
		    read=new Scanner(file);
			while(read.hasNextLine()) {
				data=read.nextLine();
				System.out.println(data);
			}
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		finally {
			read.close();
		}
	}

}
