package test2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfile {
	public void copy(File srcFile,File destFile) throws IOException{
		if(!destFile.exists()){
			destFile.mkdir();
		}
		File[] fileArray=srcFile.listFiles();
		for(File f:fileArray){
			if(f.isFile()&&f.getName().endsWith(".java")){
				BufferedInputStream in=new BufferedInputStream(new FileInputStream(f));
				String fileName=f.getName();
				fileName=fileName.replaceAll(".java",".txt");
				File newDestFile=new File(destFile,fileName);
				BufferedOutputStream out =new BufferedOutputStream(new FileOutputStream(newDestFile));
				byte[] byteArray=new byte[1024];
				int len=0;
				while((len=in.read(byteArray))!=-1){
					out.write(byteArray,0,len);
					out.flush();
				}
				in.close();
				out.close();
				System.out.println("�����ļ����ӣ�" + f.getAbsolutePath() + " ����" + newDestFile + " ������ɣ�");
			}
		}
	}
	public static void main(String[] args){
		File srcFile = new File("F:\\javaѧϰ����\\20150118\\day21");
		File destFile = new File("D:\\test\\aaa_copy");
	}
}
