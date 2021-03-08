package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class txt {
	private static void method1(File srcFile,File destFile) throws 	IOException{
			BufferedReader in=new BufferedReader(new FileReader(srcFile));
			BufferedWriter out=new BufferedWriter(new FileWriter(destFile));
			String row=null;
			while((row=in.readLine()) !=null){
				out.write(row);
				out.newLine();
				out.flush();
			}
			in.close();
			out.close();
	}
	
	private static void method2(File srcFile,File destFile) throws IOException{
		BufferedReader in=new BufferedReader(new FileReader(srcFile));
		BufferedWriter out=new BufferedWriter(new FileWriter(destFile));
		char[] charArray=new char[1024];
		int len=0;
		while((len=in.read(charArray))!=-1){
			out.write(charArray,0,len);
			out.flush();
		}
		in.close();
		out.close();
	}
	private static void method3(File srcFile,File destFile) throws IOException {
		FileReader in = new FileReader(srcFile);
		FileWriter out=new FileWriter(destFile);
		int n=0;
		while((n=in.read())!=-1){
			out.write(n);
			out.flush();
		}
		in.close();
		out.close();
	}
	
	private static void  method4(File srcFile,File destFile) throws IOException{
		FileReader in =new FileReader(srcFile);
		FileWriter out=new FileWriter(destFile);
		char[] charArray=new char[1024];
		int len=0;
		while((len=in.read(charArray))!=-1){
			out.write(charArray,0,len);
			out.flush();
		}
		in.close();
		out.close();
	}
	
	public static void main(String[] args){
		File srcFile=new File("D:\\test\\a.txt");
		File destFile=new File("D:\\test\\b.txt");
		try {
			//	method1(srcFile,destFile);
			//	method2(srcFile,destFile);
			//	method3(srcFile,destFile);
				method4(srcFile,destFile);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("¸´ÖÆÍê±Ï£¡");
		}
	}

