package service;

import java.util.ArrayList;
import java.util.HashMap;

import domain.AdminBean;

public class AdminServiceImpl implements AdminService {
	private HashMap<String, AdminBean> map;
	private int seq;

	public AdminServiceImpl() {
		map = new HashMap<>();
		seq = 0;
	}

	@Override
	public void createAdmin(String name, String pass, String auth) {
		AdminBean admin = new AdminBean();
		seq++;
		admin.setAdminNum(String.valueOf(seq));
		admin.setAuth(auth);
		admin.setName(name);
		admin.setPass(pass);
		map.put(admin.getAdminNum(), admin);

	}

	@Override
	public ArrayList<AdminBean> list() {
		return (ArrayList<AdminBean>) map.values();
	}

	@Override
	public ArrayList<AdminBean> findByAuth(String auth) {
		ArrayList<AdminBean> list = new ArrayList<>();
		// º¸·ù
		return list;
	}

	@Override
	public AdminBean findById(String adminNum) {
		return map.get(adminNum);
	}

	@Override
	public int countAdmin() {
		// TODO Auto-generated method stub
		return map.size();
	}

	@Override
	public boolean existAdmin(String adminNum, String pass) {
		boolean exist = false;
		if (map.containsKey(adminNum) && map.get(adminNum).getPass().equals(pass)) {
			exist = true;
		}
		return exist;
	}

	@Override
	public void updatePass(String adminNum, String pass, String newPass) {
		if (map.get(adminNum).getPass().equals(pass)) {
			map.get(adminNum).setPass(newPass);
		}
	}

	@Override
	public void updateAuth(String adminNum, String auth) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAdmin(String adminNum) {
		map.remove(adminNum);
	}
}
