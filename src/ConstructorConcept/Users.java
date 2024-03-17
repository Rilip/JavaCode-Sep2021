package ConstructorConcept;

public class Users {

	String firstname;
	int userId;
	boolean isActive;
	String city;
	public Users(String firstname, int userId, boolean isActive, String city) {
		this.firstname = firstname;
		this.userId = userId;
		this.isActive = isActive;
		this.city = city;
	}
	public Users(String firstname, String city) {
		this.firstname = firstname;
		this.city = city;
	}
	public Users(String firstname, int userId, String city) {
		this.firstname = firstname;
		this.userId = userId;
		this.city = city;
	}
	
	
	
}
