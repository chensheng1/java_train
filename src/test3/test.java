package test3;
import java.util.ArrayList;  
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,4,5,9,24,25,30,34};
		ArrayList<Integer> cs = new ArrayList<Integer>();
		int num=10;
		int count=0;
		for(int i=0;i<list.length;i++){
			if(list[i]>num){
				cs.add(count);
				num+=10;
				count=0;
				if(list[i]<=num){
					count++;
				}
			}
			if(list[i]<=num){
				count++;
			}
			if(num>30){
				break;
			}
			
		}
		System.out.println(cs);
	}

}
