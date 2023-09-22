package com.ezen.soo1;

public class Sample { // 클래스는 틀이다 데이터가 들어오면 보여줌

	 int first,second;

	public Sample() {} //디폴트생성자

	public Sample(int first, int second) { //객체초기화생성자
		super();
		this.first = first;
		this.second = second;
	}

	public int getFirst() { 
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void out() {
		
		System.out.println(first+"+"+second+"="+(first+second));
		
	}
	 
	 
}
