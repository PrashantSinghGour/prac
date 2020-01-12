package User;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentPojo {
	@Id
	private String name;
	private String username;
	private String password;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "StudentPojo [name=" + name + ", username=" + username + ", password=" + password + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	

}