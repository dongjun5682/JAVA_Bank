package domain;

/**
 * @author Seo Dong-Jun
 * @date 2018. 12. 26.
 * @desc ÀºÇà°èÁÂ ºó°´Ã¼
 */
public class AccountBean {
	private String accountNum,today;
	private int money;
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "\n °èÁÂÁ¤º¸ [°èÁÂÁ¤º¸: " + accountNum + ", °³¼³³¯Â¥: " + today + ", ÀÜ¾× : " + money + "]";
	}
	
	
	
}
