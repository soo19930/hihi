package com.ezen.test0926.member;

import java.util.ArrayList;

public interface Service {
	public void meminput(String id,String pw,String name,String tell,String sb,String address,String hobby,String memo);
	public ArrayList<MemberDTO> memout();
	public void memdelete(String id);
	public ArrayList<MemberDTO> memmodiform(String id);
	public void memmodify(String id,String pw,String name,String tell,String sb,String address,String hobby,String memo);
	public ArrayList<MemberDTO> memsearchviewid(String memsvalue);
	public ArrayList<MemberDTO> memsearchviewname(String memsvalue);
	public ArrayList<MemberDTO> memsearchviewadd(String memsvalue);
	public MemberDTO login(String id,String pw);
}
