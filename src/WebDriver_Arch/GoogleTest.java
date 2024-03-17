package WebDriver_Arch;

public class GoogleTest {
static WebDriver driver;  //defining at class level
	public static void main(String[] args) {
	//i can not create object of interface
		
	//	ChromeDriver driver=new ChromeDriver();  //launch chrome browser ,,default constructor will print
	//	FirefoxDriver driver=new FirefoxDriver();
		
		//child class object be refereed by parent class interface
		//top casting
		
		//cross browser logic
		String browser="chrome";
		if (browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if (browser.equals("safari")) {
			driver=new SafariDriver();
		}
		else {
			System.out.println("please pass the right browser: ");
		}
		
		//WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");  //launch the: http://www.google.com
		String title = driver.getTitle();
		System.out.println(title);  //some title
		
		driver.findelement();//findelement
		driver.findelements();//findelements
		
		driver.click(); //click on element
		driver.sendkeys("naveen@gmail.com"); //enter value :naveen@gmail.com
		driver.close(); //close the browser
		
	}

}
