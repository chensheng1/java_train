package test3;

import java.util.ArrayList;
import java.util.List;

public class binary_search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary_search cd=new binary_search();
		int[] list1={1,2,3,4,5,6,7,8,9};
		System.out.print(cd.search(list1,2));
	}
	
	public List<String> search(int[] list1,int number){
		int low=0;
		int hight=list1.length-1;
		int mid =(low + hight)/2;
		List<String> list=new ArrayList<String>();
		while(low<=hight){
			mid =(low + hight)/2;
			list.add(String.valueOf(mid+1));
			if (number<list1[mid]){
				hight=mid-1;
			}else if(number==list1[mid]){
				return list;
			}else{
				low=mid+1;
			}
		}
		return list;
	}
}
