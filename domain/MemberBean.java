package domain;

/**
 * @author Seo Dong-Jun
 * @date 2018. 12. 26.
 * @desc ������ ��ü
 */
public class MemberBean {
	
private String id,name,ssn,pass;
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
	public String getPass(){
		return pass;
	}
	@Override
	public String toString() {
		return String.format("[��������]\n"
				+ "���̵� : %s\n"
				+ "�н����� : %s\n"
				+ "�̸� : %s\n"
				+ "�ֹι�ȣ : %s\n", id,pass,name,ssn);
	}
}
