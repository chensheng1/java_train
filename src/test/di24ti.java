package test;

import javax.swing.JOptionPane;

/**
 * 对十个数进行排序
 * @author cs
 *@time2016-11-25
 */

public class di24ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySort as=new ArraySort(20);
		String s=JOptionPane.showInputDialog("请输入10个数据，用空格隔开\n").trim();
		String[] k=s.split(" ");
		for(int i=0;i<k.length;i++){
			 as.insert(Integer.parseInt(k[i]));
		}
		 as.selectSort();  
	        as.print();  
	}
public static class ArraySort{
	int items;
	int[] array;
	ArraySort(int max){
		array=new int[max];
		items=0;
	}
	public void insert(int k){
		array[items++]=k;
		
	}
	 public void selectSort(){  
	        int k=0;  
	        for(int i=0;i<items-1;i++){  
	            k=i;  
	            for(int j=i+1;j<items;j++){  
	                if(array[k]>array[j]){  
	                    k=j;  
	                }  
	            }  
	             if(i!=k){  
	                 array[i]^=array[k];  
	                 array[k]^=array[i];  
	                 array[i]^=array[k];  
	             }  
	        }  
	          
	    }  
	    public void print(){  
	        for(int i=0;i<items;i++)  
	            System.out.print(array[i]+" ");  
}
}
}