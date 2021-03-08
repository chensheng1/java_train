package test;

import java.util.Scanner;

/**
 * Ñî»ÔÈı½Ç
 * @author cs
 *@time2016-12-4
 */

public class di29ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÇëÊäÈëÑî»ÔÈı½ÇµÄ²ãÊı£º");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt()+1;
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				if(i==j||j==0||i==0||j==i){
					a[i][j]=1;
				}else{
					a[i][j]=a[i-1][j]+a[i-1][j-1];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
