package test;
/**
 * 计算101到200的素数
 * @author cs
 *@Time2016-10-6
 */
public class sushu {
	public static void main(String arg[]){
		/*
		 * 
		 */
	System.out.println("------101到200之间的素数-------");
		int j;
		for(int i=101;i<=200;i++){
			for(j=2;j<i;j++){
				if(i%j==0){
					break;
				      }
			}
			    if(i==j){
			      System.out.print("素数为"+i);
			    }
			}
		}
}


