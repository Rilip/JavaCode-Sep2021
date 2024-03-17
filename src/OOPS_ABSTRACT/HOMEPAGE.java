package OOPS_ABSTRACT;

public class HOMEPAGE extends PAGE {

	@Override
	public void title() {
	System.out.println("HP--------->title");	
		
	}

	@Override
	public void url() {
		System.out.println("HP--------->url");
		
	}
	//Override method from page class  individual method wrs  Page
    @Override
	public void header(){
		System.out.println("HomePage header");
	}
    //individual methods
    public void logout() {
    	System.out.println("logout method");
    }
    
}
