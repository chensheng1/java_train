package test;
/**
 * 计算完数
 * @author cs
 *@TIME2016-11-11
 */

public class wanshu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		for(int i=1;i<=1000;i++){
			//int n=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
				    n+=j;
					//System.out.println(i+"输出"+n);
				}
			}
				if(n==i){
					System.out.println(i+"输出"+n);
				}
			
			//System.out.println(i+"总的输出"+num);
			}
		}
}


