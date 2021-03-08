package test;

import java.util.Arrays;

public class arraybinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a[] = new int[]{1,2,5,6,8,7};
		arraybinary cs =new arraybinary();
		cs.reOrderArray(a);
	}
	public boolean Find(int target, int [][] array) {
		int low=0;
		int high=array.length-1;
		while(low<=high){
			int middle=(high+low)/2;
			int i=array[middle][0];
			if(i==target){
				return true;
			}else if(i>target){
				high=middle-1;
			}else{
				low=middle+1;
			}
			if(low==high && i>target){
				hen(target,array,middle-1);
			}
			if(low==high && i<target){
				hen(target,array,middle);
			}
		}
		return false;
	}
	public boolean hen(int target, int [][] array,int middle){
		int x=0;
		int y=array[middle].length-1;
		while(x<=y){
			int k=(x+y)/2;
			int g=array[middle][k];
			if(g==target){
				return true;
			}
			else if(g>target){
				y=g-1;
			}else{
				x=g+1;
			}
		}
		return false;
	}
	 
	public int minNumberInRotateArray(int [] array) {
		if(array==null && array.length==0){
			return 0;
		}
		int low=0;
		int high=array.length-1;
		int mid=low;
		while(high>=low){
			if(array[high]>=array[low]){
				high--;
			}else if(array[low]>=array[high]){
				low++;
			}
		}
		return 0;
		
	}
	
	 public void reOrderArray(int [] array) {
	        for(int i=0;i<array.length;i++){
	        	if(array[i]%2==0){
	        		for(int j=i;j<array.length;j++){
	        			if(array[j]%2==1){
	        				int temp=array[j];
	        				while(j>i){
	        					array[j]=array[j-1];
	        					j--;
	        				}
	        				array[j]=temp;
	        				i++;
	        			}
	        		}
	        		
	        	}
	        	
	        }
	        System.out.print(Arrays.toString(array));
	    }
}
