package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2,n3;
		System.out.println("�� �Է� : ");
		n1 = scan.nextInt();
		String s1 = (n1%2 == 0)?"¦��":"Ȧ��";
		System.out.println(n1 + " = "+s1);
		s1 = (n1%3 == 0)?"3�� ���":"3�� ����� �ƴϴ�";
		System.out.println(n1 + " = "+s1);
		
		System.out.println("�� �� �Է� : ");
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		System.out.println("num1 : "+n2+" ,num2 : "+n3);
		String s2 = (n2 > n3)?"num1�� num2���� ũ��":"num2�� num1���� ũ��";
		System.out.println(s2);
	}
}
