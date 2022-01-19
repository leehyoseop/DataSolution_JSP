package com.hyoseop.jan191.m;

import java.util.Iterator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class M {
	//-값
	//  갈색요청 소속
	//   parameter(a, b)
	//   attribute(cc)
	//  갈색이 닿으면 그 값을 사용할 수 있음
	//  새로운 요청이 일어나는 상황에서는 값 사용 불가
	//  Third까지 살아서 갈 수 있는 방법이 필요(현재 Third쪽으로는 위의 요청이 닿지 않음)
	
	//-parameter
	//	GET : 주소에(컨트롤러?파라미터명=값&파라미터명=값&...)
	//	POST : 내부전달(주소에 컨트롤러?파라미터명=값 안보임)
	
	// V에서 만든 값
	// String or String[]
	// request 소속
	
	// 값 읽기
	//	Java : request.getParameter("파라미터 명")
	//	JSP(EL) : ${param.파라미터명 }
	
	// -request소속 attribute
	//	M에서 만든 값
	//	Object
	//	request 소속
	
	// 값읽기
	//	Java : request.getAttribute("어트리뷰트명");
	//	JSP(EL) : ${어트리뷰트명 }
	
	//////////////////////////////////////////////
	
	//HTTP 프로토콜 특성이자 약점
	//	1. Connectionless
	//	사용자가 요청을 한 후에 응답받았을 때 연결이 끊기는 특징
	//	2. Stateless
	//	통신이 끝나면 상태를 끊어버리는 특징
	//	이 약점을 보완하기 위해서 쿠키/세션 사용
	
	//쿠키(Cookie) : 
	//	사용자의 상태정보를 컴퓨터에 저장을 했다가 나중에 참조
	//	사용자가 따로 요청을 안해도 브라우저가 요청을 하면
	//	자동으로 서버에 전송해줌
	//	한	번 시간을 정해놓으면 브라우저 종료 여부와 상관없이 유지할 수 있음
	//		=> ID, 비번 저장하기, 쇼핑물 장바구니, 팝업창 (오늘 하루 보지않기),...
	
	//	M에서 만든 값
	//	String
	//	기본 유지시간 - 24시간?
	//	사용자 컴퓨터에 저장되는데... -요새는 암호화를 해서 저장을 하지만...
	//	위험함! - 노출하면 위험한 정보는 쿠키에 저장하면 안됨!
	
	//	값읽기
	//	Java : 현재 사용자컴퓨터에 만들어져있는 쿠키들을 -> 그중에 이 프로젝트꺼를 찾아서
	//	JSP(EL) : ${cookie.이름.value }
	
	
	//세션(Session) : (그림파일의 핑크색으로 연결)
	//	쿠키를 기반으로 동작 but 사용자의정보를 Server에서 관리
	//	접속시간 설정 O, 일정 시간동안 응답이 없으면 
	//	쿠키보다는 보안이 좋음, 메모리 사용량 큼
	//	동접자 수가 많게 되면 -> 서버 과부하 -> 성능 저하
	
	//	session 소속 attribute
	//	M에서 만든 값
	//	Object
	//	연결만 되어있으면 어디서든지 사용이 가능
	//	유지시간 : 기본 30분, 설정 가능, 
	//				시간동안 아무요청도 안하면 자동으로 끊김.
	
	//	쿠키 : 정해놓은 시간이 만료되거나, 쿠키를 삭제하기 전까지는 유지
	//	세션 : 만료되는 시간을 지정할 수 있지만, 브라우저가 종료되면 바로 삭제
	
	
	public static void makeSecondData(HttpServletRequest req, HttpServletResponse res) {
		int c = 3000;
		req.setAttribute("cc", c);
		
		int d = 40000;
		HttpSession hs = req.getSession(); // 사용자와 서버간의 연결상태
		hs.setMaxInactiveInterval(30); // session의 유지시간을 30초
		hs.setAttribute("d", d); // session소속의 attribute
		
		String e = "50000";
		Cookie ck = new Cookie("e", e);
		ck.setMaxAge(15); //15초동안은 사용자 컴퓨터에 파일로 저장
		res.addCookie(ck); //응답 객체에 쿠키를 추가
	}
	
	public static void printSecondDataNew(HttpServletRequest req) {
		try {
			HttpSession hs = req.getSession();
			int d = (Integer) hs.getAttribute("d");
			System.out.println(d);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Cookie[] cks = req.getCookies(); //저장되어있는 쿠키들이기 때문에 배열
		for (Cookie cookie : cks) {
			if (cookie.getName().equals("e")) { //쿠키 이름이 e인것
				System.out.println(cookie.getValue());
			}
		}
	}
	
	public static void printSecondData(HttpServletRequest req) {
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		int c = (Integer)req.getAttribute("cc");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}