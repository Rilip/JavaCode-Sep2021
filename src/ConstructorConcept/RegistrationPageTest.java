package ConstructorConcept;

public class RegistrationPageTest {

	public static void main(String[] args) {
		RegistrationPage obj=new RegistrationPage();
		System.out.println(obj.getFirstname()+" "+obj.getLastname()+" "+obj.getTelephone()+" "+obj.getEmailid()+" "+obj.getFax());
		
		obj.setFirstname("Tom");
		obj.setLastname("peter");
		obj.setEmailid("test@gmail.com");
		obj.setTelephone(9999999);
		obj.setFax("123123FAX");
		
		System.out.println(obj.getFirstname()+" "+obj.getLastname()+" "+obj.getEmailid()+" "+obj.getFax()+" "+obj.getTelephone());
		
		
	}

}
