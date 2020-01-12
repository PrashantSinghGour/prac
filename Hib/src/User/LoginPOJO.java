package User;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginPOJO {
	@Id
	private String uname;
	private int password;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	

}
