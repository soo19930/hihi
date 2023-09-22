package com.ezen.cat.score;

import java.util.ArrayList;


public interface Service {
	public void scoreinput(String name, int kor, int eng, int mat,int tot, double avg, String hak);
	public ArrayList<ScoreDTO> scoreout();
	
}
