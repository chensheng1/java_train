package test3;

import java.util.ArrayList;
import java.util.List;

public class tiaoshui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1 = {4,5,1,3,2};
		
		tiaoshui cs =new tiaoshui();
		System.out.println(cs.test(list1));
	}
	public List<Integer> test(int[] list1){
		List<Integer> list= new ArrayList<Integer>();
		  for(int i=0;i<=list1.length-1;i++){
			  int k=0;
			  for(int j=0;j<i;j++){
				  if(list1[i]<list1[j]){
					  k=k+1;
				  }
			  }
			  list.add(k);
		  }
		  return list;
	}
}
