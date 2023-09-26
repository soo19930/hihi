package com.ezen.test0926.sp;

import java.util.ArrayList;

public interface Service {

	public void inserts(int num,String spname,String name,String saledate,String spec,int price,String fname,int groups);
	public ArrayList<SpDTO> out();
	public void delete(int num);
	public ArrayList<SpDTO> detail(int num);
	public void cnt(int num);
	public ArrayList<SpDTO> mo1(int num);
	public void mo2(int num,String spname,String name,String saledate,String spec,int price,String fname);
	public ArrayList<SpDTO> spsearchspname(String spvalue);
	public ArrayList<SpDTO> spsearchname(String spvalue);
	 public ArrayList<SpDTO> out2();
	public ArrayList<SpDTO> out3();
	public int cntnotice();
	public ArrayList<SpDTO> selectnotice(PageDTO dto);
	public ArrayList<SpDTO> spreply(int num);
	public void insertreplyr(int num,String spname,String name,String saledate,
			String spec,int price,String image,int groups,int step,int indent);
	public void stepup(int groups, int step);
	}
	

