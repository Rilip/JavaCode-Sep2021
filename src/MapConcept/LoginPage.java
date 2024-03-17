package MapConcept;

import java.util.HashMap;

public class LoginPage {

	
	//RBAC---Permission or Role based ,roles /users
	//like admin and partner
	
	public static String getUserCred(String roles) {
		
		HashMap<String, String>credMap=new HashMap<String ,String>();
		credMap.put("admin", "admin@az.com:admi123");
		credMap.put("customer", "cust@az.com:cust123");
		credMap.put("seller", "seller@az.com:seller123");
		credMap.put("partner", "partner@az.com:part123");
		credMap.put("distributor", "dist@az.com:dist123");
		credMap.put("catmaager", "Catmgr@az.com:catmgr123");
		
		return credMap.get(roles);
	}
	public static void dologin(String un,String pwd) {
		System.out.println("login with:"+un+":"+pwd);
	}
	public static void main(String[] args) {
		
		String cred[]  = getUserCred("admin").split(":");
		String un = cred[0].trim();
		String pwd = cred[1].trim();
		dologin(un, pwd);
		
		System.out.println("********************");
		String cred1[]  = getUserCred("customer").split(":");
		String un1 = cred1[0].trim();
		String pwd1 = cred1[1].trim();
		dologin(un1, pwd1);
		
		
		System.out.println("********************");
		String cred2[]  = getUserCred("customer").split(":");
		String un2 = cred2[0].trim();
		String pwd2 = cred[1].trim();
		dologin(un2, pwd2);
		
	}

}
