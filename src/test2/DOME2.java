package test2;

import java.io.File;

public class DOME2 {
	public static void main(String[] args) {
		//1.封装初始目录
		File file = new File("F:\\java学习资料\\20150118\\day19\\");
		listfile(file);
	}
	public static void listfile(File file){
		//2.获取目录下所有的文件和目录
		File[] fileArray = file.listFiles();
		//注意：如果当前File对象下面没有文件和目录，listFiles()方法返回的是null
		//3.遍历
		if(fileArray!= null){
			for(File f : fileArray){
				//4.判断是否是文件
				if(f.isFile() && f.getName().endsWith(".java")){
					System.out.println(f.getAbsolutePath());
				}else{//是一个目录,递归调用
					listfile(f);
				}
			}
		}
	}
}
