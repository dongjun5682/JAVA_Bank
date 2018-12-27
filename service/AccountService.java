package service;

import java.util.ArrayList;

import domain.AccountBean;

/**
 * @author Seo Dong-Jun
 * @date 2018. 12. 26.
 * @desc 은행계좌 서비스
 */
public interface AccountService {

	// CREATE
	public String createAccount(int money);

	public String createAccountNum();

	// READ
	public ArrayList<AccountBean> findAll();

	public AccountBean findByAccountNum(String accountNum);

	public int countAccount();

	public boolean existAccountNum(String accountNum);

	public String findDate();

	// UPDATE
	public String depositMoney(String accountNum, String money);

	public String withdrawalMoney(String accountNum, String money);

	// DELETE
	public AccountBean deleteAccountNum(String accountNum);

}
