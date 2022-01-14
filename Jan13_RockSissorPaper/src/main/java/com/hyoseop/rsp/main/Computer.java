package com.hyoseop.rsp.main;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class Computer {
	
	public static int cnt = 0;
	public static int win = 0;
	public static int draw = 0;
	public static int lose = 0;
	
//	public static Computer com = new Computer();
	
//	public Computer() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	public static Computer getCom() {
//		return com;
//	}

	public static void Judge(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("EUC-KR");
			int userhand = Integer.parseInt(request.getParameter("userhand"));
			System.out.println(userhand);
			//System.out.println(userhand);
			Random r = new Random();
			int computerhand = r.nextInt(3)+1;
			
			//int cnt=0; int win=0; int draw=0; int lose=0;
			
			String comhand = null;
			String usrhand = null;
			
			if (userhand == 1) {
				usrhand = "sissor";
			} else if (userhand == 2) {
				usrhand = "rock";
			} else if (userhand == 3) {
				usrhand = "paper";
			}

			if (computerhand == 1) {
				comhand = "sissor";
			} else if (computerhand == 2) {
				comhand = "rock";
			} else if (computerhand == 3) {
				comhand = "paper";
			}
			
			if((userhand - computerhand) == -1 || (userhand - computerhand) == 2) {
				System.out.printf("유저=%d, 컴퓨터=%d 유저 패배\n", userhand, computerhand);
				cnt++;
				lose++;
			} else if ((userhand - computerhand) == 0) {
				System.out.printf("유저=%d, 컴퓨터=%d 무승부\n", userhand, computerhand);
				cnt++;
				draw++;
			} else {
				System.out.printf("유저=%d, 컴퓨터=%d 유저 승리\n", userhand, computerhand);
				cnt++;
				win++;
			}
			
			System.out.printf("%d전 %d승 %d무 %d패",cnt, win, draw, lose);
			
			request.setAttribute("cnt", cnt);
			request.setAttribute("win", win);
			request.setAttribute("draw", draw);
			request.setAttribute("lose", lose);
			request.setAttribute("usrhand", usrhand);
			request.setAttribute("comhand", comhand);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
				
	}
}
