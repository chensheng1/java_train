package test3;

import java.util.Random;
import java.util.Scanner;

public class game {
	public void start(){
		Scanner input=new Scanner(System.in);
		Random n=new Random();
		int x=n.nextInt(100)+1;
		int count=0;
		System.out.println("�����Ѿ����ɣ����Կ�ʼ��...");
		
		while(true){
			System.out.print("��������µ����֣�");
			int uNum = input.nextInt();
			count++;
			if(uNum > x){
				System.out.println("���ˣ�");
			}else if (uNum < x){
				System.out.println("���ˣ�");
			}else{
				System.out.println("��ϲ�㣬�µ��ˣ�����Ϊ��" + x + " ����� �� " + count + " �Ρ�");
				break;
			}
		}
	}
}
