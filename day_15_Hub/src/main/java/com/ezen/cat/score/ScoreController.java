package com.ezen.cat.score;

import java.text.ChoiceFormat;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ScoreController {

	@Autowired
	SqlSession sqlSession;
	ArrayList<ScoreDTO>list = new ArrayList<ScoreDTO>();
	
	@RequestMapping(value = "/scoreinput")
	public String ss1() {
		return "scoreinput";
	}
	
	@RequestMapping(value = "/scoresave", method = RequestMethod.POST)
	public String ss2(HttpServletRequest request) {
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		double jum[] = {0,60,70,80,90};
		String hh[] = {"F","D","C","B","A"};
		ChoiceFormat cf = new ChoiceFormat(jum, hh);
		String hak = cf.format(avg);
		Service ss = sqlSession.getMapper(Service.class);
		ss.scoreinput(name,kor,eng,mat,tot,avg,hak);
		return "redirect:main";
	}
	
	@RequestMapping(value = "/scoreout")
	public String ss3(Model mo) {
		Service ss = sqlSession.getMapper(Service.class);
		list = ss.scoreout();
		mo.addAttribute("list", list);
		return "scoreout";
	}
	
	
}
