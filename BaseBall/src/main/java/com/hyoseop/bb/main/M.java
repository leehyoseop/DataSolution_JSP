package com.hyoseop.bb.main;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class M {
	
	private static final M model = new M();
	
	public M() {
		// TODO Auto-generated constructor stub
	}
	public static int[] createAnswer() {
		int[] answerArr = new int[3];
 
		Random r = new Random();
		answerArr[0]= r.nextInt(10);
		for (int i = 0; i < 1; i++) {
			answerArr[1] = r.nextInt(10);
			answerArr[2] = r.nextInt(10);
			if (answerArr[0] == answerArr[1] || answerArr[0] == answerArr[2] 
					|| answerArr[1] == answerArr[2]) {
				i--;
			}
		}
		System.out.println("정답");
		for (int i : answerArr) {
			System.out.print(i);
		}
		System.out.println("\n===");
		return answerArr;
	}
	
	public static void check(HttpServletRequest request, int[] answer) throws UnsupportedEncodingException {
		request.setCharacterEncoding("euc-kr");
//		int[] answerArr = new int[3];
//		
//	
//		Random r = new Random();
//		answerArr[0]= r.nextInt(10);
//		for (int i = 0; i < 1; i++) {
//			answerArr[1] = r.nextInt(10);
//			answerArr[2] = r.nextInt(10);
//			if (answerArr[0] == answerArr[1] || answerArr[0] == answerArr[2] 
//					|| answerArr[1] == answerArr[2]) {
//				i--;
//			}
//		}
			
		int[] realAnswer = answer;
		System.out.println("\nRe정답");
		for (int i : realAnswer) {
			System.out.print(i);
		}
		System.out.println("\n=====");
		int [] userArr = new int[3];
		int usernumber = Integer.parseInt((request.getParameter("number")));
//		String usernumber = (request.getParameter("number"));
//		System.out.println("사용자");
//		System.out.println(usernumber);
		userArr[0] = usernumber/100;
		userArr[1] = (usernumber%100)/10;
		userArr[2] = ((usernumber%100)%10)/1;
//		for (int i = 0; i < userArr.length; i++) {
//			 userArr[i] = usernumber.charAt(i);
//		}
		System.out.println("사용자<배열>");
		for (int i : userArr) {
			System.out.print(i);
		}
	}
}
