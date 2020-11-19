package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3의 배수의 개수와 배수의 합을 출력
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int j = 0;
		int result = 0;
		
		for(int i=0; i<data.length; i++) {
			if(data[i]%3==0) {
				//3의 배수의 개수
				j++;
				//3의 배수의 합
				result = result + data[i];
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + j);
		System.out.println("주어진 배열에서 3의 배수의 합 => " + result);
	}

}
