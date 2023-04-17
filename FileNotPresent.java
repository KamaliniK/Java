package Exceptions;
import java.io.File;
import java.util.Scanner;
class FileNotPresentException extends Exception{
	public FileNotPresentException(String msg) {
		super(msg);
	}
}

public class FilePresent {
	public static void checker(String filepath) throws FileNotPresentException{
		File file = new File(filepath);
		if(!file.exists())
			throw new FileNotPresentException("FIle does not present");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String filepath=s.nextLine();
		//File file = new File(filepath);
		try {
			checker(filepath);
			System.out.println("File Present");
		}
		catch(FileNotPresentException f) {
			f.printStackTrace();
		}

	}

}
