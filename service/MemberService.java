package service;

import domain.MemberBean;

/**
 * @author Seo Dong-Jun
 * @date 2018. 12. 26.
 * @desc 은행계좌 서비스
 */
public interface MemberService {
	
	public void creatMember(String id,String pass,String name,String ssn);
	
	public MemberBean[] findAll();
	public MemberBean[]  findByName(String name);
	public MemberBean findById(String id);
	public int countMember();
	public boolean existMember(String id ,String pass);
	
	public void updatePass(String id, String pass, String newPass);
	public void deleteMember(String id, String pass);
	
}
