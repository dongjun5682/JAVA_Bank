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
		int j = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				count++;
			}
		}
		MemberBean[] memberBeans = new MemberBean[j];
		j = 0;
		for (int i = 0; i < count; i++) {
			if(members[i].getName().equals(name)){
				memberBeans[j] = members[i];
				j++;
				if(j == memberBeans.length){
					break;
				}
			}
		}
		return memberBeans;
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
		for (int i = 0; i < count; i++) {
			if (existMember(id,pass)) {
				members[i].setPass(newPass);
				break;
			}
		}
	}

	@Override
	public void deleteMember(String id, String pass) {
		for (int i = 0; i < count; i++) {
			if (existMember(id,pass)) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
				break;
			}
		}
	}


}
