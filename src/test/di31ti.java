package test;

import javax.swing.JOptionPane;

import test.di24ti.ArraySort;

/**
 * ��һ����������ֵ������ǰ�棬��Сֵ���������
 * @author cs
 *@time2016-12-6
 */

public class di31ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArraySort as=new ArraySort(20);
		String s=JOptionPane.showInputDialog("������10�����ݣ��ÿո����\n").trim();
		String[] n=s.split(" ");
		char[] x=s.toCharArray();*/
		int[] x={55,52,14,3,25};
		for(int i=0;i<x.length;i++){
			if(x[0]<x[i]){
				int temp=x[0];
				x[0]=x[i];
				x[i]= (char) temp;
			}
			if(x[x.length-1]>x[i]){
				int temp=x[x.length-1];
				x[x.length-1]=x[i];
				x[i]=(char) temp;
			}
			System.out.print(x[i]);
		}
		
	}

}
