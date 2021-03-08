package test3;

public class user {
	private String loginuser;
	private String loginpwd;
	public user(String loginuser, String loginpwd) {
		super();
		this.loginuser = loginuser;
		this.loginpwd = loginpwd;
	}
	public String getLoginuser() {
		return loginuser;
	}
	public void setLoginuser(String loginuser) {
		this.loginuser = loginuser;
	}
	public String getLoginpwd() {
		return loginpwd;
	}
	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}
	
}
