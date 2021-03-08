package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 用1，2,3,4组合三位数
 * @author cs
 *@TIME2016-11-12
 */

public class zuheshuzi {
		public void test(){
			int num;
			int t=0;
			for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
			for(int z=1;z<=4;z++){
			if(i!=j&&j!=z&&i!=z){
			    t++;
			    num=i+j*10+z*100;
				System.out.println("个位数"+i+"十位数"+j+"百位数"+z+"合并后"+num);
			 }
		    }
		}
		}
			System.out.println("总共遍历的次数"+t);
	}
		
//方法二：
		public void test2(){
			int a[]={1,2,3,4};
			int b[]={1,2,3,4};
			int c[]={1,2,3,4};
			int num=0;
			int k=0;
			for(int i=0;i<a.length;i++){
				for(int j=0;j<b.length;j++){
					for(int z=0;z<c.length;z++){
						if(a[i]!=b[j]&&a[i]!=c[z]&&b[j]!=c[z]){
							num=a[i]+b[j]*10+c[z]*100;
							System.out.println(num);
							k++;
						}
					}
				}
			}System.out.println("输出次数"+k);
		}
		
//方法三：采用树结构的方法，没有写出来！！
		
		public static void main(String arg[]){
			zuheshuzi cs=new zuheshuzi();
			cs.test();
			//cs.test2();
		}
}
