package day003;

import java.util.Scanner;
public class TestInput {

	public static void main(String[] args){
		System.out.println("用户输入姓名和年龄");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		System.out.println("姓名:" + name + " 年龄:" + age);
		
	}
}
