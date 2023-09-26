package com.ezen.test0926.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	@Autowired
	SqlSession sqlSession;
	ArrayList<MemberDTO>list = new ArrayList<MemberDTO>();
	
	@RequestMapping(value = "/memberinput")
	public String mm1() {
		return "memberinput";
	}
	
	@RequestMapping(value = "/membersave", method = RequestMethod.POST)
	public String mm2(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tell = request.getParameter("tell");
		String sb = request.getParameter("sb");
		String address = request.getParameter("address");
		String hobbys[] = request.getParameterValues("hobby");
		String hobby="";
		for(int i=0 ; i<hobbys.length ; i++) {
			hobby += hobbys[i]+" ";
		}
		String memo = request.getParameter("memo");
		
		Service ss = sqlSession.getMapper(Service.class);
		ss.meminput(id,pw,name,tell,sb,address,hobby,memo);
		
		return "redirect:memberinput";
	}
	
	@RequestMapping(value = "/memberout")
	public String mm3(Model mo) {
		Service ss = sqlSession.getMapper(Service.class);
		list = ss.memout();
		mo.addAttribute("list", list);
		return "memberout";
	}
	
	@RequestMapping(value = "/memberdelete")
	public String mm4(HttpServletRequest request) {
		String id = request.getParameter("id");
		Service ss = sqlSession.getMapper(Service.class);
		ss.memdelete(id);
		return "redirect:memberout";
	}
	
	@RequestMapping(value = "/membermodiform")
	public String mm5(HttpServletRequest request,Model mo) {
		String id = request.getParameter("id");
		Service ss = sqlSession.getMapper(Service.class);
		list = ss.memmodiform(id);
		mo.addAttribute("list", list);
		return "membermodiform";
	}
	
	@RequestMapping(value = "/membermodify", method = RequestMethod.POST)
	public String mm6(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tell = request.getParameter("tell");
		String sb = request.getParameter("sb");
		String address = request.getParameter("address");
		String hobbys[] = request.getParameterValues("hobby");
		String hobby="";
		for(int i=0 ; i<hobbys.length ; i++) {
			hobby += hobbys[i]+" ";
		}
		String memo = request.getParameter("memo");
		
		Service ss = sqlSession.getMapper(Service.class);
		ss.memmodify(id,pw,name,tell,sb,address,hobby,memo);
		return "redirect:memberout";
	}
	
	@RequestMapping(value = "/membersearchform")
	public String mm7() {
		return "membersearchform";
	}
	
	@RequestMapping(value = "/membersearchview", method = RequestMethod.POST)
	public String mm8(HttpServletRequest request, Model mo) {
		String memsitem = request.getParameter("memsitem");
		String memsvalue = request.getParameter("memsvalue");
		Service ss = sqlSession.getMapper(Service.class);
		if(memsitem.equals("id")) list = ss.memsearchviewid(memsvalue);
		else if(memsitem.equals("name")) list = ss.memsearchviewname(memsvalue);
		else list = ss.memsearchviewadd(memsvalue);
		mo.addAttribute("list", list);
		
		return "membersearchview";
	}
	
	@RequestMapping(value = "/loginform")
	public String mm9() {
		return "loginform";
	}
	
	@RequestMapping(value = "/login")
	public String mm10(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		Service ss = sqlSession.getMapper(Service.class);
		MemberDTO dto = ss.login(id, pw);
		HttpSession hs = request.getSession();
		if(dto!=null) {
		hs.setAttribute("member", dto);
		hs.setAttribute("loginstate", true);
		hs.setMaxInactiveInterval(60*30);
		return "redirect:main";
		}
		else {
			return "error2";
		}
	}
		@RequestMapping(value = "/logout")
		public String mm11(HttpServletRequest request) {
			HttpSession hs = request.getSession();
			hs.removeAttribute("member");
			hs.removeAttribute("loginstate");
			hs.setAttribute("loginstate", false);
			return "redirect:main";
		}
}
