package test;
/**
 * 水仙花
 * @author cs
 *@TIME2016-11-7
 */

public class shuixianhua {
	public static void main(String arg[]){
		/*
		 * 
		 */
		int x,y,z;
		int a,b,c;
		for(int i=100;i<=999;i++){
			x=i/100;
			y=i%100/10;
			z=i%10;
			a=(int) Math.pow(x,3);//求一个数的多少次幂，例如：x*x*x
			b=(int) Math.pow(y,3);
			c=(int) Math.pow(z,3);
			if(i==a+b+c){
				System.out.println("水仙花数为"+i);
			}
		}
	}
}
