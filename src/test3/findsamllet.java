package test3;

import java.util.Arrays;


public class findsamllet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findsamllet cs=new findsamllet();
		int[] list1={1,7,2,9};
		cs.find(list1);
		System.out.println(Arrays.toString(list1));
	}
	
	public void find(int[] list){
		for(int x=0;x<list.length;x++){
				for(int y=x+1;y<list.length;y++){
					if(list[x]<list[y]){
						int temp=list[x];
						list[x]=list[y];
						list[y]=temp;
					}
				}
		}
		
	}
}
