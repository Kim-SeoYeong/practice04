package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] WonArray = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int count = 0;	//개수 카운트
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 : ");
		int price = sc.nextInt();
		
		for(int i=0; i< WonArray.length; i++) {
			count = price / WonArray[i];
			System.out.println(WonArray[i] + "원 : " + count + "개");
			price = price - (WonArray[i] * count);
		}
		
		sc.close();
	}

}
