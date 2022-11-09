package Exception2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {

	public static void FindFile() throws IOException {
		File file = new File("abc.txt");
		FileInputStream fin = new FileInputStream(file);
		System.out.println(fin.available());
		System.out.println(fin.read());
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FindFile();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
