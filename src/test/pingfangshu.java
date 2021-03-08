package test;
/**
 * 判断一个数是不是完全平方数
 * @author cs
 *@TIME2016-11-13
 */

public class pingfangshu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,k,z;
		for(int i=1;i<=1000;i++){
			k=i+100;
			z=i+168+100;
			n=(int) Math.sqrt(k);
			m=(int) Math.sqrt(z);
			if(n*n==k&&m*m==z){
				System.out.println("完全平方数"+i);
			}
		}
	}
}

