package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2,n3;
		System.out.println("수 입력 : ");
		n1 = scan.nextInt();
		String s1 = (n1%2 == 0)?"짝수":"홀수";
		System.out.println(n1 + " = "+s1);
		s1 = (n1%3 == 0)?"3의 배수":"3의 배수가 아니다";
		System.out.println(n1 + " = "+s1);
		
		System.out.println("두 수 입력 : ");
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		System.out.println("num1 : "+n2+" ,num2 : "+n3);
		String s2 = (n2 > n3)?"num1이 num2보다 크다":"num2가 num1보다 크다";
		System.out.println(s2);
	}
}
