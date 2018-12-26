package service;

import domain.AccountBean;

/**
 * @author Seo Dong-Jun
 * @date 2018. 12. 26.
 * @desc 은행계좌 서비스
 */
public interface AccountService {

	public void createAccount(int money);
	public AccountBean[] findAll();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccount();
	public boolean existAccountNum(String accountNum);
	public String findToday(); 
	public String depositMoney(int money); 
	public String withdrawalMoney(int money); 
	public void deleteAccountNum(String accountNum);
	
	
}
