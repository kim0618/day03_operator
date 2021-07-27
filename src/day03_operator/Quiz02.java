package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1번
		int n1;
		System.out.println("입력한 데이터 : ");
		n1 = scan.nextInt();
		if(n1%3 ==0) {
			System.out.println(n1);
		}
		// 2번
		int n2;
		System.out.println("절대값 : ");
		n2 = scan.nextInt();
		if(n2>=0) {
			System.out.println(n2);
		}
		if(n2<0) {
			System.out.println(n2*-1);
		}
		// 3번
		int n3,n4;
		System.out.println("두 수 입력 : ");
		n3 = scan.nextInt();
		n4 = scan.nextInt();
		if(n3>n4) {
			System.out.println(n3);
		}
		if(n3<n4) {
			System.out.println(n4);
		}
		// 4번
		int n5,n6,n7,max;
		System.out.println("세 수 입력 : ");
		n5 = scan.nextInt();
		n6 = scan.nextInt();
		n7 = scan.nextInt();
		if(n5 >= n6 && n5 >= n7) {
			max = n5;
		}
		else if(n6 >= n5 && n6 >= n7) {
			max = n6;
		}
		else {
			max = n7;
		}
		System.out.println(max);
		
		// 5번
		int n8,n9;
		System.out.println("두 수 입력 : ");
		n8 = scan.nextInt();
		n9 = scan.nextInt();
		if(n8 > n9 && n8%2 == 0) {
			System.out.println(n8);
		}
		if(n8 < n9 && n9%2 == 0) {
			System.out.println(n9);
		}
		
		// 6번
		int s1,s2,s3;
		System.out.println("두 수 입력 : ");
		s1 = scan.nextInt();
		s2 = scan.nextInt();
		s3 = s1+s2;
		if(s3%2 == 0 && s3%3 == 0) {
			System.out.println(s3);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
