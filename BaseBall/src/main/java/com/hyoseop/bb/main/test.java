package com.hyoseop.bb.main;

import java.util.Iterator;
import java.util.Random;

public class test {
	public static void main(String[] args) {
		Random r = new Random();
		int[] answerArr = new int[3];
		
		answerArr[0]= r.nextInt(9);
		
		for (int i = 0; i < 1; i++) {
			answerArr[1] = r.nextInt(9);
			answerArr[2] = r.nextInt(9);
			if (answerArr[0] == answerArr[1] || answerArr[0] == answerArr[2] 
					|| answerArr[1] == answerArr[2]) {
				i--;
			}
		}
		
//		for (int i = 0; i < 1; i++) {
//			answerArr[1] = r.nextInt(9);
//			if (answerArr[0] == answerArr[1]) {
//				i--;
//			}
//		}
//		
//		for (int i = 0; i < 1; i++) {
//			answerArr[2] = r.nextInt(9);
//			if (answerArr[0] == answerArr[2] || answerArr[1] == answerArr[2]) {
//				i--;
//			}
//		}
		
		for (int i : answerArr) {
			System.out.print(i);
		}
	}
}
