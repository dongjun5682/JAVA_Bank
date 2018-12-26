package service;

import domain.MemberBean;

/**
 * @author Seo Dong-Jun
 * @date 2018. 12. 26.
 * @desc ¸â¹ö±â´É ±¸Çö°´Ã¼
 */
public class MemberServiceImpl implements MemberService {

	private MemberBean[] members;
	private int count;
	
	 public MemberServiceImpl(){
		members = new MemberBean[10];
		count = 0;
	}
	@Override
	public void creatMember(String id,String pass,String name,String ssn) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		member.setSsn(ssn);
		members[count] = member;
		count++;
		
	}

	@Override
	public MemberBean[] findAll() {
		return members;
	}
	
	@Override
	public MemberBean[] findByName(String name) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if(members[i].getId().equals(name)){
				
				break;
			}
		}
		return members;
	}
	
	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if(members[i].getId().equals(id)){
				member = members[i];
				break;
			}
		}
		return member;
	}

	@Override
	public int countMember() {
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean login = false;
		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				login = true;
				break;
			}
		}
		return login;
				
	}

	@Override
	public void updatePass(String id, String pass, String newPass) {
		
	}

	@Override
	public void deleteMember(String id, String pass) {
		// TODO Auto-generated method stub
		
	}


}
