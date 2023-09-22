package com.ezen.ppp;

import java.util.ArrayList;

public interface Service {
	
	public void inserta(MyDTO myDTO);
	public ArrayList<MyDTO> outb();
	public ArrayList<MyDTO> delete(String id);
	public ArrayList<MyDTO> mo(String id);
	public void mot(MyDTO myDTO);


	
}
