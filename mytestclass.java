package mytestpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mytestclass {

	public static void main(String[] args) {
		  WebDriver driver = new FirefoxDriver();
		  driver.get("http://web.njit.edu/~mer4/is421.html");
		  String i = driver.getCurrentUrl();
		  System.out.println(i);
		  driver.close();
	}
}
