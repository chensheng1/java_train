package test2;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyLineNumberReader {
	private FileReader reader;
	private int lineNumber;
	private String path;
	public MyLineNumberReader( String path) throws FileNotFoundException {
		this.path = path;
		reader =new FileReader(path);
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String readLine() throws IOException{
		StringBuffer buf=new StringBuffer();
		int n=0;
		while((n=this.reader.read())!=-1){
			if(n=='\r'){
				continue;
			}
			if(n=='\n'){
				this.lineNumber++;
				return buf.toString();
			}
			buf.append((char)n);
		}
		if(buf.length()>0){
			this.lineNumber++;
			return buf.toString();
			
		}else{
			return null;
		}
	}
	public void close() throws IOException{
		this.reader.close();
	}
	
}
