package day003;

import java.util.Scanner;

public class InputInfo {
	public static void main(String[] args){
		System.out.println("**********��ӭ������Ʒ����ϵͳ**********");
		System.out.println("1.�û���¼ 2.�û�ע�� 3.��ѯ��Ʒ");
		System.out.println("4.�����Ʒ 5.������ѯ 6.�����ѯ");
		System.out.println("7.�˳�ϵͳ");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1 = sc.next();
		System.out.println("�û��������" + str);
		System.out.println("�û��������" + str1);
	}
}
