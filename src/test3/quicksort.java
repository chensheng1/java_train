package test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class quicksort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quicksort cs=new quicksort();
		int[] list={7,6,5,13,19,2,20};
		int i=0;
		int j=list.length-1;
		cs.quick(list,i,j);
		for(int x = 0; x<list.length; x++){
            System.out.println(list[x]);
        }
	}
    
	public void quick(int[] list,int strat,int end){
		if(list==null||list.length<2){
			System.out.println(Arrays.toString(list));
		}else{
			int i=strat;
			int j=end;
			int key=list[strat];
			while(i<j){
				while(i<j&&key<=list[j]){
					j--;
				}
				if(key>list[j]){
					int temp=list[j];
					list[j]=list[i];
					list[i]=temp;
				}
				while(i<j&&key>list[i]){
					i++;
				}
				if(key<list[i]){
					int temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
			if(i>strat){
				quick(list,strat,i-1);
			}
			if(end>j){
				quick(list,j+1,end);
			}
		}
	}
}
