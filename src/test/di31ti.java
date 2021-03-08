package test;

import javax.swing.JOptionPane;

import test.di24ti.ArraySort;

/**
 * 把一个数组的最大值放在最前面，最小值放在最后面
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
		String s=JOptionPane.showInputDialog("请输入10个数据，用空格隔开\n").trim();
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
