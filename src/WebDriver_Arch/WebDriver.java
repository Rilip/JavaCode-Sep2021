package WebDriver_Arch;

public interface WebDriver extends SearchContext {

	//can i override parent interface with child interface---yes i can override
	@Override
	public void findelement();
	
	@Override
	public void findelements();
	
	public void click();
	
	public void sendkeys(String value);
	
	public void get(String url);
	
	public String getTitle();
	
	public void close();
	
	public void quit();
}
