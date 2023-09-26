package com.ezen.test0926.sp;

public class SpDTO {
	int num;
	String spname,name,saledate,spec;
	int price;
	String image;
	int cnt,groups,step,indent;
	 int ptot;
	
	public int getPtot() {
		return ptot;
	}
	public void setPtot(int ptot) {
		this.ptot = ptot;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getGroups() {
		return groups;
	}
	public void setGroups(int groups) {
		this.groups = groups;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public int getIndent() {
		return indent;
	}
	public void setIndent(int indent) {
		this.indent = indent;
	}
	public SpDTO() {}
	public SpDTO(int num, String spname, String name, String saledate, String spec, int price, String image) {
		super();
		this.num = num;
		this.spname = spname;
		this.name = name;
		this.saledate = saledate;
		this.spec = spec;
		this.price = price;
		this.image = image;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSaledate() {
		return saledate;
	}
	public void setSaledate(String saledate) {
		this.saledate = saledate;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	

}
