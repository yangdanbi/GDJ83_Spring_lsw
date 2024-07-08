package com.lsw.app.member;

import java.util.List;

import com.lsw.app.account.AccountDTO;

public class MemberDTO {
	
	private String member_id;
	private String member_pw;
	private String member_name;
	private String member_phone;
	private String member_email;
	private List<AccountDTO> dtos;
	
	

	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public List<AccountDTO> getDtos() {
		return dtos;
	}
	public void setDtos(List<AccountDTO> dtos) {
		this.dtos = dtos;
	}
	
	
	

}
