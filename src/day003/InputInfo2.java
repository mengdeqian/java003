package day003;

import java.util.Scanner;

public class InputInfo2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		
		String username = sc.next();
		
		System.out.println("请输入密码");
//		String password = sc.nextLine();
		int a = sc.nextInt();
		System.out.println("密码是" + a);
		
	}
}
