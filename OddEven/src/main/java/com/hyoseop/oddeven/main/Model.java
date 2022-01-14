package com.hyoseop.oddeven.main;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class Model {
	
	private static final Model model = new Model();
	
	private Model() {
		// TODO Auto-generated constructor stub
	}
	
	public static Model getModel() {
		return model;
	}




	public static void Judge(HttpServletRequest request) {
		
		try {
			request.setCharacterEncoding("euc-kr");
			String UserPick = request.getParameter("UserPick");
			System.out.println(UserPick);
			Random r = new Random();
			int ComputerSelect = r.nextInt(30)+1;
			System.out.println(ComputerSelect);
			String comselect = null;
			String result = null;
			
			if (ComputerSelect%2 == 0) {
				comselect = "even";
				
			} else {
				comselect = "odd";
			}
			
			if (comselect.equals(UserPick)) {
				result = "Bingo!:)";
			} else {
				result = "Wuuuuuu!:(";
			}
			
			request.setAttribute("result", result);
			
			System.out.println(result);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
