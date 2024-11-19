package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KtmTest {
	@Test
	public void demo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(
				"https://www.ktmindia.com/ktm-bikes/naked-bike/ktm-200-duke?utm_source=google&utm_medium=cpc&utm_campaign=EDM_Brand_KTMDuke_lower_search_South_Exact&utm_customdetails=Duke_200&utm_customdetails1=Duke_LeadGen_D2C&utm_customdetails2=Search_google&gad_source=1&gclid=Cj0KCQiA_qG5BhDTARIsAA0UHSIv2VUU_O5o3BHMdFczHDcK5kryeoKYizGQckFysEwz-Ih4CEDzK_waAkRWEALw_wcB");
Reporter.log("KTM",true);
	}

}
