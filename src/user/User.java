package user;

//자바 beans
//JSP에서 데이터를 받아 올 수 있음
public class User {

	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	//객체를 보기 쉽게
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userPassword=" + userPassword + ", userName=" + userName + ", userGender="
				+ userGender + ", userEmail=" + userEmail + "]";
	}
	
	
	
	
}
