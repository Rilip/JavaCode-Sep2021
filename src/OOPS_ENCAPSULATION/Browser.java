package OOPS_ENCAPSULATION;

public class Browser {

	public void launchBrowser() {
		System.out.println("Launch Browser");
		checkVersion();
		checkOSVersion();
		checkEnoughRAM();
		System.out.println("browser is launched");
	}
	
	public void getVersion() {
		checkVersion();
	}
	//checkversion--pr
	//checkOSVersion--pr
	//checkEoughRAM--pr
	private void checkVersion() {
		System.out.println("Check Browser Version");
	}
	private void checkOSVersion() {
		System.out.println("Check OS version");
	}
	private void checkEnoughRAM() {
		System.out.println("checkEnoughRAM");
	}
	
	
	
}
