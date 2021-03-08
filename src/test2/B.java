package test2;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MyLineNumberReader in = new MyLineNumberReader("D:\\test\\b.txt");
			String row = null;
			System.out.println(in.getLineNumber());
			System.out.println(in.getLineNumber());
			System.out.println(in.getLineNumber());
			in.setLineNumber(50);
			while((row = in.readLine()) != null){
				System.out.println(in.getLineNumber() + "ÐÐ£º" + row);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
