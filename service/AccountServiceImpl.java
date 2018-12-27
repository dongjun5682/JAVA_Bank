package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

/**
 * @author Seo Dong-Jun
 * @date 2018. 12. 26.
 * @desc ������� ������ü
 */
public class AccountServiceImpl implements AccountService {
	private ArrayList<AccountBean> list;

	public AccountServiceImpl() {
		list = new ArrayList<>();
	}

	/************************
	 * CREATE
	 ***********************/

	@Override
	public String createAccount(int money) {
		String msg = "�����Ǿ����ϴ�.";
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(findDate());
		list.add(account);
		return msg;
	}

	@Override
	public String createAccountNum() {
		Random random = new Random();
		String accountNum = "";

		for (int i = 0; i < 8; i++) {
			if (i != 3) {
				accountNum += random.nextInt(10);
			} else {
				accountNum += random.nextInt(10) + "-";
			}
		}
		return accountNum;
	}

	/************************
	 * READ
	 ***********************/
	@Override
	public ArrayList<AccountBean> findAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
				break;
			}
		}
		return account;
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean exist = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				exist = true;
				break;
			}
		}
		return exist;
	}

	@Override
	public String findDate() {

		Date date = new Date();
		SimpleDateFormat simpDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		return simpDate.format(date);
	}

	/************************
	 * UPDATE
	 ***********************/
	@Override
	public String depositMoney(String accountNum, String money) {
		String msg = "";
		int moneys = Integer.parseInt(money);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				if (moneys >= 0) {
					int resMoney = list.get(i).getMoney();
					resMoney += moneys;
					list.get(i).setMoney(resMoney);
					msg = money + "�� �ԱݵǾ����ϴ�.";
					break;
				} else {
					msg = "�Աݾ��� �߸��Է��ϼ̽��ϴ�.";
					break;
				}
			} else {
				msg = "���¹�ȣ�� Ʋ�Ƚ��ϴ�.";
			}
		}
		return msg;
	}

	@Override
	public String withdrawalMoney(String accountNum, String money) {
		String msg = "";
		int moneys = Integer.parseInt(money);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				int resMoney = list.get(i).getMoney();
				if (resMoney  >= moneys) {
					resMoney -= moneys;
					list.get(i).setMoney(resMoney);
					msg = money + "�� ��ݵǾ����ϴ�.";
					break;
				} else {
					msg = "�ܾ��� �����մϴ�";
					break;
				}
			} else {
				msg = "���¹�ȣ�� Ʋ�Ƚ��ϴ�.";
			}
		}
		return msg;
	}

	/************************
	 * DELETE
	 ***********************/
	@Override
	public AccountBean deleteAccountNum(String accountNum) {
		AccountBean acBean = new AccountBean();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				acBean = list.remove(i);
				break;
			}
		}
		return acBean;
	}
}
