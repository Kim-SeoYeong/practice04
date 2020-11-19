package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numArr[] = new int[6];
		
		for (int i = 0; i < numArr.length; i++) {
			//랜덤한 값을 배열에 넣는다
			numArr[i] = (int)(Math.random()*45)+1;
			//System.out.println(numArr[i]);
		//	중복값 비교를 위해 for문 한번 더 돌림
			for (int j = 0; j < i; j++) {
				//중복값 체크하는 과정
				if(numArr[i] == numArr[j]) {
					i--;	//중복되었기 때문에 해당 칸에 들어가지 않고 다시 비교할 수 있도록 i를 감소시킴
				}
			}
		}
		//중복이 제거된 로또 번호 출력
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
	}

}
