package com.lsw.app.member;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsw.app.account.AccountDAO;
import com.lsw.app.account.AccountDTO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private AccountDAO accountDAO;
	
	public int join(MemberDTO memberDTO) throws Exception {
		return memberDAO.join(memberDTO);
	}
	
	public MemberDTO login(MemberDTO memberDTO) throws Exception {
		
		MemberDTO result = memberDAO.login(memberDTO);
		// 매개변수에 담긴 유저가 입력한 pw도 살려야하고 DAO를 통해 db에서 가져온 pw도 살려야 비교가 가능하기 때문에
		// 새로운 객체 result를 만들어 따로 담은 것
		if(result != null) {
			if(result.getMember_pw().equals( memberDTO.getMember_pw() )) {
				//로그인 성공시점
				
				return result;
			} else {
				// return null;
				result = null;
			}
		}
		
		return result;
	}
	
	
	public int update(MemberDTO memberDTO) throws Exception {
		return memberDAO.update(memberDTO);
	}
	
	
	public int delete(MemberDTO memberDTO) throws Exception {
		return memberDAO.delete(memberDTO);
	}

	
	public MemberDTO getDetail(MemberDTO memberDTO) throws Exception {
		return memberDAO.getDetail(memberDTO); 
	}
	
	
}
