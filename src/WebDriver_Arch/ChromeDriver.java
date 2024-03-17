package WebDriver_Arch;

public class ChromeDriver implements WebDriver {
	public ChromeDriver() {
		System.out.println("launch chrome browser");
	}

	@Override
	public void findelement() {
		System.out.println("findelement");
		
	}

	@Override
	public void findelements() {
	System.out.println("findelements");
		
	}

	@Override
	public void click() {
	System.out.println("click on element");
		
	}

	@Override
	public void sendkeys(String value) {
		System.out.println("enter value :"+value);
		
	}

	@Override
	public void get(String url) {
	System.out.println("launch the: "+url);
		
	}

	@Override
	public String getTitle() {
		
		return "some title";
	}

	@Override
	public void close() {
		System.out.println("close the browser");
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

}
