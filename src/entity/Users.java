package entity;
//User calss
public class Users {
	
	private int uid;
	private String username;
	private String passward;
	
	public Users() {
		
	}
		
	public Users(int uid, String username, String passward) {
		//super();
		this.uid = uid;
		this.username = username;
		this.passward = passward;
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	
	

}
