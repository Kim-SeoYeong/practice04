package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg = 0;
		int result = 0;
		int[] numArr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<numArr.length; i++) {
			int num = sc.nextInt();
			numArr[i] = num;
			
			// 총 합계
			result = result + numArr[i];
			// 평균
			avg = result / numArr.length;
		}
		
		System.out.println("평균은 " + avg + " 입니다.");
		
		sc.close();
	}	

}
