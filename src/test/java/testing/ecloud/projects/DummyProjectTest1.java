package testing.ecloud.projects;

import net.sf.sahi.client.Browser;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import testing.ecloud.helpers.DriverProvider;


public class DummyProjectTest1 {
	private Browser b;

	@Features("Projects tests")
	@TestCaseId("1446")
	@Test(groups = "projects")
	public void test() throws InterruptedException {
		b.navigateTo(System.getProperty("server.address"));
		b.textbox("userName[1]").setValue(System.getProperty("user.login"));
		b.password("password[1]").setValue(System.getProperty("user.password"));
		b.submit("Login[1]").click();

	}

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws InterruptedException {
		b = DriverProvider.getBrowser();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown(){
		DriverProvider.tearDownSahiBrowser();
	}
}
