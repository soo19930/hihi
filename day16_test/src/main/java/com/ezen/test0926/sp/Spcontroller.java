package com.ezen.test0926.sp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class Spcontroller {

	@Autowired
	SqlSession sqlSession;
	
	ArrayList<SpDTO> list = new ArrayList<SpDTO>();
	
	static String image_path="C:\\6산대특\\spring\\day16_test\\src\\main\\webapp\\image";
	@RequestMapping(value = "/spinput")
	public String f(){
		return "spinput";
	}
	
	
	@RequestMapping(value = "/spsave",method = RequestMethod.POST)
	public String f2(MultipartHttpServletRequest mul) throws IllegalStateException, IOException
	{
		int num = Integer.parseInt(mul.getParameter("num"));
		String spname = mul.getParameter("spname");
		String name = mul.getParameter("name");
		String saledate = mul.getParameter("saledate");
		String spec = mul.getParameter("spec");
		int price = Integer.parseInt(mul.getParameter("price"));
		MultipartFile mf = mul.getFile("image");
		String fname = mf.getOriginalFilename();
		mf.transferTo(new File(image_path+"\\"+fname));
		Service ss = sqlSession.getMapper(Service.class);
		ss.inserts(num,spname,name,saledate,spec,price,fname,num);
		
		return "spinput";
	}
	
	@RequestMapping(value = "/spout")
	public String f3(Model mo){
		
		Service ss = sqlSession.getMapper(Service.class);
		ArrayList<SpDTO>list = ss.out();
		mo.addAttribute("list", list);
		
		return "spout";
	}
	
	@RequestMapping(value = "/delete")
	public String f4(HttpServletRequest request){
		
		int num = Integer.parseInt(request.getParameter("num"));
		Service ss = sqlSession.getMapper(Service.class);
		ss.delete(num);
	
		
		return "redirect:spout";
	}
	
	@RequestMapping(value = "/detail")
	public String f5(HttpServletRequest request,Model mo){
		
		int num = Integer.parseInt(request.getParameter("num"));
		Service ss = sqlSession.getMapper(Service.class);
		ArrayList<SpDTO>list= ss.detail(num);
		ss.cnt(num);
		mo.addAttribute("list", list);
		
		return "detail";
	}
	
	@RequestMapping(value = "/modifyform")
	public String f6(HttpServletRequest request,Model mo){
		
		int num = Integer.parseInt(request.getParameter("num"));
		Service ss = sqlSession.getMapper(Service.class);
		ArrayList<SpDTO>list= ss.mo1(num);
		mo.addAttribute("list", list);
		
		return "modifyform";
	}

	@RequestMapping(value = "/modifysave",method = RequestMethod.POST)
	public String f7(MultipartHttpServletRequest mul) throws IllegalStateException, IOException
	{
		int num = Integer.parseInt(mul.getParameter("num"));
		String spname = mul.getParameter("spname");
		String name = mul.getParameter("name");
		String saledate = mul.getParameter("saledate");
		String spec = mul.getParameter("spec");
		int price = Integer.parseInt(mul.getParameter("price"));
		MultipartFile mf = mul.getFile("image");
		String fname = mf.getOriginalFilename();
		mf.transferTo(new File(image_path+"\\"+fname));
		Service ss = sqlSession.getMapper(Service.class);
		ss.mo2(num,spname,name,saledate,spec,price,fname);
		
		
		return "redirect:spout";
	}

	@RequestMapping(value = "/spsearchview", method = RequestMethod.POST)
	public String f8(HttpServletRequest request, Model mo) {
		String spitem = request.getParameter("spitem");
		String query = request.getParameter("query");
		Service ss = sqlSession.getMapper(Service.class);
		if(spitem.equals("spname")) list = ss.spsearchspname(query);
		else list = ss.spsearchname(query);
		mo.addAttribute("list", list);
		
		return "spsearchview";
	}

	  @RequestMapping(value = "/spout2")
      public String out2(Model mo){
         Service ss = sqlSession.getMapper(Service.class);
         ArrayList<SpDTO> list = ss.out2();
         mo.addAttribute("list", list);
         return "spout2";
      }

      @RequestMapping(value = "/spout3")
      public String out3(Model mo){
         Service ss = sqlSession.getMapper(Service.class);
         ArrayList<SpDTO> list = ss.out3();
         mo.addAttribute("list", list);
         return "spout3";
      }
	
  	@RequestMapping(value="spreply", method = RequestMethod.POST)
  	public String spreply(HttpServletRequest request, Model mo) {
  		int num = Integer.parseInt(request.getParameter("num"));
  		Service ss = sqlSession.getMapper(Service.class);
  		
  		ArrayList<SpDTO> list = ss.spreply(num);
  		mo.addAttribute("list",list);
  		return "spreplyview";
  	}
  	
  	@RequestMapping(value="spreplysave", method = RequestMethod.POST)
  	public String spreply(MultipartHttpServletRequest multi) throws Exception, IOException {
  		int num = Integer.parseInt(multi.getParameter("num"));
  		String spname = multi.getParameter("spname");
  		String name = multi.getParameter("name");
  		String saledate = multi.getParameter("saledate");
  		String spec = multi.getParameter("spec");
  		int price = Integer.parseInt(multi.getParameter("price"));
  		String image = multi.getParameter("image");
  		
  		MultipartFile mf = multi.getFile("image");
  		image = mf.getOriginalFilename();
  		Service ss = sqlSession.getMapper(Service.class);
  		mf.transferTo(new File(image_path+"\\"+image));
  		
  		int groups = Integer.parseInt(multi.getParameter("groups"));		
  		int step = Integer.parseInt(multi.getParameter("step"));		
  		int indent = Integer.parseInt(multi.getParameter("indent"));		
  		
  		stepup(groups, step);
  		step++;
  		indent++;
  		ss.insertreplyr(num,spname,name,saledate,spec,price,image,groups,step,indent);
  		return "main";
  	}
  	
  	public void stepup(int groups, int step) {
  		Service ss = sqlSession.getMapper(Service.class);
  		ss.stepup(groups,step);
  	}
      
      
    //페이징 처리
	  @RequestMapping(value="/spoutpage")
  public String ko16(HttpServletRequest request, PageDTO dto,Model mo) {
     String nowPage=request.getParameter("nowPage");
     String cntPerPage=request.getParameter("cntPerPage");
     Service notice = sqlSession.getMapper(Service.class);
     //전체레코드수구하기
     int total=notice.cntnotice();
     if(nowPage==null && cntPerPage == null) {
        nowPage="1";
        cntPerPage="5";
     }
     else if(nowPage==null) {
        nowPage="1";
     }
     else if(cntPerPage==null) {
        cntPerPage="5";
     }      
     dto=new PageDTO(total,Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));
     mo.addAttribute("paging",dto);
     mo.addAttribute("list",notice.selectnotice(dto));
     return "spoutpage";
  }
	  
	  
      
}
