package com.hyoseop.jan173jstlc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class jSTLCDataMaker {
	public static void make(HttpServletRequest req) {
		int[] arr = {123, 456, 789};
		req.setAttribute("arr", arr);
		
		ArrayList<Hyoseop> al = new ArrayList<Hyoseop>();
		al.add(new Hyoseop("¿Ã»øº∑",3, 180, 70.5));
		al.add(new Hyoseop("±Ë»øº∑",18, 160, 90.5));
		
		req.setAttribute("al", al);
	}
}
