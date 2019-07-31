package day003;

import java.util.Scanner;

public class TestVarInput {
	
	public static void main(String[] args){
		
//		String name = "zhangsan";
		
		System.out.println("请输入姓名和年龄:");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int age = sc.nextInt();
		System.out.println("name:" + name + " age" + age);
		
		
		
		
	}

}
