package test2;

import java.io.File;

public class DOME2 {
	public static void main(String[] args) {
		//1.��װ��ʼĿ¼
		File file = new File("F:\\javaѧϰ����\\20150118\\day19\\");
		listfile(file);
	}
	public static void listfile(File file){
		//2.��ȡĿ¼�����е��ļ���Ŀ¼
		File[] fileArray = file.listFiles();
		//ע�⣺�����ǰFile��������û���ļ���Ŀ¼��listFiles()�������ص���null
		//3.����
		if(fileArray!= null){
			for(File f : fileArray){
				//4.�ж��Ƿ����ļ�
				if(f.isFile() && f.getName().endsWith(".java")){
					System.out.println(f.getAbsolutePath());
				}else{//��һ��Ŀ¼,�ݹ����
					listfile(f);
				}
			}
		}
	}
}
