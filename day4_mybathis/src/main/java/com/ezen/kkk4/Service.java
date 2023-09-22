package com.ezen.kkk4;

import java.util.ArrayList;

public interface Service {
	
	 //데이터 추가하는 기능
		//controller에서 데이터 넘겨받음
			//받아오면서 dao.xml에 넘겨줌
	public void inserta(String name,int age,String tell);
	
	//데이터호출 doa.xml에서 정보 받아옴
	public ArrayList<MyDTO> out();
	
	
}
